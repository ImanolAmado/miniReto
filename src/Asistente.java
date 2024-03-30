public class Asistente {


    public void habla(String texto) { 

        SimpleTextToSpeech s = new SimpleTextToSpeech();
		String[] data = new String[2];
        data[0]="es_ES";
        data[1]=texto;
		try {
                        
			SimpleTextToSpeech.main(data);
	        String filename = "output.mp3";
	        //System.out.println(filename);
	        MP3 mp3 = new MP3(filename);
	        mp3.play();              

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();       
        }                       
                
    }
}