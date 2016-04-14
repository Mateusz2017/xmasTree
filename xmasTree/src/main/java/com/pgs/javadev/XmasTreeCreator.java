package com.pgs.javadev;

public class XmasTreeCreator {
	String text_test="";
	public String createXmasTree(String text, int levels, String direction) {
		
	    if(direction=="up"){
	      for (int i = 0; i < levels; i++) {
	      for (int j = 0; j < levels - i-1; j++) {
	    	  text_test+=" ";
	      }
	      for (int j = 0; j <= i * 2; j++) {
	    	  text_test+=text;
	      }
	      text_test+="\n";
	    	}
}
	    else if (direction=="down") {
	    	text_test="";
		      System.out.println();
	    	for (int i = 0; i < levels; i++) {
	    	for (int j = 0; j < i; j++) {
	    		text_test+=" ";
		      }
		      for (int j = 0; j <= (levels-i-1)*2; j++) {
		    	  text_test+=text;
		      }
		      text_test+="\n";
		    }
	    }
	    else if (direction=="right") {
		      System.out.println();
		    	text_test="";
	    	for (int i = 1; i < levels*2; i++) {
	    	if(i<=levels){
		    	for (int j = 0; j < i; j++)
		    		text_test+=text;
	    	}
		    else if(i>levels){	
					for(int j1 = levels*2-i;j1>0;j1--)
						text_test+=text;
				}
	    		text_test+="\n";
		}
	    }
	    else if (direction=="left") {
	    	text_test="";
		      System.out.println();
	    	for(int i=1; i < levels*2; i++){
	    		if(i<=levels){
	    			for(int j = 0; j < levels - i; j++)
	    				text_test+=" ";
	    				for(int j1 = 0; j1 < i; j1++)
	    					text_test+=text;
	    		}
	    		else if (i>levels) {
					for(int j = 0; j < i-levels; j++)
						text_test+=" ";
					for(int j1=levels*2-i;j1>0;j1--)
						text_test+=text;
				}
	    		text_test+="\n";
	    	}
	    }
	    text_test=text_test.substring(0, text_test.length()-1);
		return text_test;
}
}