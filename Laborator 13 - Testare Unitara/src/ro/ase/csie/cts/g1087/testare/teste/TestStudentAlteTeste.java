package ro.ase.csie.cts.g1087.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1087.testare.modele.Student;
import ro.ase.csie.cts.g1087.testare.teste.categorii.TesteImportante;

public class TestStudentAlteTeste {
	
	//text fixture
	static Student student;
	static ArrayList<Integer>note;
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;
	static ArrayList<Integer>noteTestPerformanta;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		note=new ArrayList<>();
		nrNoteInitiale=3;
		Random random=new Random();
		for(int i=0;i<nrNoteInitiale;i++) {
			//genereaza intre 0 si 9
			note.add(random.nextInt(Student.MAX_NOTA+1));
		}
		numeInitial="Gigel";
		varstaInitiala=Student.MAX_VARSTA+1;
	
		noteTestPerformanta=new ArrayList<>();
		int nrNote=10000000;
		for(int i=0;i<nrNote;i++) {
			noteTestPerformanta.add(Student.MAX_NOTA);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student=new Student(numeInitial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMinInt() throws ExceptieVarsta {
		int varstaNoua=Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	
	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMaxInt() throws ExceptieVarsta {
		int varstaNoua=Integer.MAX_VALUE;
		student.setVarsta(varstaNoua);
	}
	
	@Test
	public void testSetVarstaBoundaryVarstaMinimaRight() throws ExceptieVarsta {
		int varstaNoua=student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaModificata=student.getVarsta();
		assertEquals("Test pt limita inf varsta", varstaNoua, varstaModificata);
	}
	
	@Test
	public void testSetVarstaBoundaryVarstaMximaRight() throws ExceptieVarsta {
		int varstaNoua=student.MAX_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaModificata=student.getVarsta();
		assertEquals("Test pt limita sup varsta", varstaNoua, varstaModificata);
	}
	
	@Test
	public void testSetNoteReferenceDeepCopy() throws ExceptieNota {
		ArrayList<Integer>note=new ArrayList<>();
		note.add(10);
		note.add(10);
		note.add(10);
		student.setNote(note);
		
		
		int[]noteStudent=new int[student.getNrNote()];
		
		for(int i=0;i<student.getNrNote();i++) {
			noteStudent[i]=student.getNota(i);
		}
		
		note.set(0, 5);

		int[]noteStudentDupaModificare=new int[note.size()];
		for(int i=0;i<student.getNrNote();i++) {
			noteStudentDupaModificare[i]=student.getNota(i);
		}
		
		assertArrayEquals("Test modif colectie note externa obiectului", noteStudent, noteStudentDupaModificare);
	}
	
	@Test
	public void testGetMediePerformance() throws ExceptieNota {
		ArrayList<Integer>note=new ArrayList<>();
		int nrNote=10000000;
		for(int i=0;i<nrNote;i++) {
			note.add(Student.MAX_NOTA);
		}
		
		student.setNote(note);
		
		long tStart=System.currentTimeMillis();
		float medieCalculata=student.getMedie();
		long tFinal=System.currentTimeMillis();
		
		long durataMinima=100; // 100 milisec
		long durata=tFinal-tStart;

		if(durata <= durataMinima) {
			assertTrue(true);
		}else {
			fail("Testul a depasit durata minima!");
		}
	}
	
	@Test(timeout = 500)
	public void testGetMediePerformance2JUnit4() throws ExceptieNota {
		student.setNote(noteTestPerformanta);
		student.getMedie();
	}
	
	@Test
	public void testGetNotaMinimaInverseRelation() throws ExceptieNota {
		ArrayList<Integer>note=new ArrayList<>();
		int nrNote=10000;
		Random random=new Random();
		for(int i=0;i<nrNote;i++) {
			note.add(random.nextInt(Student.MAX_NOTA+1));
		}
		
		student.setNote(note);
		
		int minimCalculat=student.getNotaMinima();
		//pt ca nu putem det valoare estimata
		//verificam relatia dintre minim si valorile initiale
		
		for(int i=0;i<nrNote;i++) {
			if(minimCalculat > note.get(i)) {
				fail("Minimul calc nu e corect");
			}
		}
		
		assertTrue(true);
	}
	
	@Category(TesteImportante.class)
	@Test
	public void testGetMedieCrossCheck() throws ExceptieNota {
		ArrayList<Integer>note=new ArrayList<>();
		int nrNote=10;
		Random random=new Random();
		for(int i=0;i<nrNote;i++) {
			note.add(random.nextInt(Student.MAX_NOTA+1));
			
			
		}	
		student.setNote(note);
		float medieEstimata=getMedieVariantaInitiala(note);
		float medieCalculata=student.getMedie();
		assertEquals("Val calculate nu st identice", medieEstimata, medieCalculata,0);
		
	}
	
	
	
	public float getMedieVariantaInitiala(ArrayList<Integer>valori) {
		float suma=0;
		for(int valoare:valori) {
			suma+=valoare;
		}
		
		return suma/valori.size();
	}
}
