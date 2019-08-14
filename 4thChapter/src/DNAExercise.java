
public class DNAExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
     char[] charArray = dna.toCharArray();
     //1.TAGG,CCAG,AGCC가 몇번 나오는 지 count하기
     int TAGG_Count = 0;
     int CCAG_Count = 0;
     int AGCC_Count = 0;
     
     for(int i=0;i<charArray.length-4; i++) {
    	  switch(charArray[i]) {
    	  
    	  case 'T':
    		  if(charArray[i+1]=='A') {
    			  if(charArray[i+2]=='G') {
    				  if(charArray[i+3]=='G') {
    					  TAGG_Count++;
    					  
    				  }
    			  }
    		  }
    		  break;
    		  
    	  case 'C':
    		  if(charArray[i+1]=='C') {
    			  if(charArray[i+2]=='A') {
    				  if(charArray[i+3]=='G') {
    					  CCAG_Count++;
    					  
    				  }
    			  }
    		  }
    		  break;
    		  
    	  case'A':
    		  if(charArray[i+1]=='G') {
    			  if(charArray[i+2]=='C') {
    				  if(charArray[i+3]=='C') {
    					  AGCC_Count++;
    				  }
    			  }
    		  }
    		  break;
    	  }
    	  
     }
     
     System.out.println("TAGG:"+TAGG_Count);
     System.out.println("CCAG:"+CCAG_Count);
     System.out.println("AGCC:"+AGCC_Count);
	}
}
