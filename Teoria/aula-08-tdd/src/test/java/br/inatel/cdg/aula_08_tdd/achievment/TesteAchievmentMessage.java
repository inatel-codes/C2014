package br.inatel.cdg.aula_08_tdd.achievment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TesteAchievmentMessage {
	
	@Mock
	AchievMsgReceiver recebedor1, recebedor2, recebedor3;

	private AchievmentMessage achMSG;
	private final String MSG = "This is Dark Souls";

	@Before
	public void init() {
		achMSG = new AchievmentMessage();
	}
	
	@Test(expected = SemRecebedoresException.class)
	public void testeSemRecebedor() {
		achMSG.distribuirMsg(MSG);
	}

	@Test
	public void testeComUmRecebedor() {
		achMSG.registrarRecebedor(recebedor1);
		achMSG.distribuirMsg(MSG);
		
		Mockito.verify(recebedor1).msgReceiver(MSG);
	}
	
	@Test
	public void testeComDoisRecebedores() {
		achMSG.registrarRecebedor(recebedor1);
		achMSG.registrarRecebedor(recebedor2);
		
		achMSG.distribuirMsg(MSG);
		
		Mockito.verify(recebedor1).msgReceiver(MSG);
		Mockito.verify(recebedor2).msgReceiver(MSG);
	}
	
	@Test
	public void testeRemoverRecebedor() {
		achMSG.registrarRecebedor(recebedor1);
		achMSG.registrarRecebedor(recebedor2);
		achMSG.removerRecebedor(recebedor1);
		
		achMSG.distribuirMsg(MSG);
		
		Mockito.verify(recebedor1, Mockito.never()).msgReceiver(MSG);
		Mockito.verify(recebedor2).msgReceiver(MSG);
	}
	
	@Test
	public void testeErroRecebedor() {
		achMSG.registrarRecebedor(recebedor1);
		achMSG.registrarRecebedor(recebedor2);
		achMSG.registrarRecebedor(recebedor3);
		
		Mockito.doThrow(RuntimeException.class).when(recebedor2).msgReceiver(MSG);
		
		achMSG.distribuirMsg(MSG);
		
		Mockito.verify(recebedor1).msgReceiver(MSG);
		Mockito.verify(recebedor2).msgReceiver(MSG);
		Mockito.verify(recebedor3).msgReceiver(MSG);
	}
}
