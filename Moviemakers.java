package com.xworkz.finalkeyword;

public class Moviemakers {
	String directionBy;
	String producedBy;
	String dialoguesBy;
	String screenplayBy;
	String storyBy;
	String cinematography;
	String editedBy;
	String musicBy;
	String distributedBy;
	String productionCompany;
	
	public Moviemakers() {
		System.out.println("This is no-argument constructor for Moviemakers Class");
	}

	public Moviemakers(String directionBy, String producedBy, String dialoguesBy, String screenplayBy, String storyBy,
			String cinematography, String editedBy, String musicBy, String distributedBy, String productionCompany) {
		
		this.directionBy = directionBy;
		this.producedBy = producedBy;
		this.dialoguesBy = dialoguesBy;
		this.screenplayBy = screenplayBy;
		this.storyBy = storyBy;
		this.cinematography = cinematography;
		this.editedBy = editedBy;
		this.musicBy = musicBy;
		this.distributedBy = distributedBy;
		this.productionCompany = productionCompany;
	}
	
	public String toString() {
		return "[directionBy='"+directionBy+"', "+" producedBy='"+producedBy+"', "+" dialoguesBy='"+dialoguesBy+"', "+" "
				+ "screenplayBy='"+screenplayBy+"', "+" storyBy='"+storyBy+"', "+" cinematography='"+cinematography+"', "+" editedBy='"+editedBy+"', "+" "
						+ "musicBy='"+musicBy+"', "+" distributedBy='"+distributedBy+"', "+" productionCompany='"+productionCompany+"']";
	}
	
	public boolean equals(Object obj) {
		if(obj==null)
		return false;
		
		if(getClass()!=obj.getClass())   
			return false;
			
			Moviemakers mm = (Moviemakers)obj;   
			if(this.directionBy==mm.directionBy && this.producedBy==mm.producedBy && this.dialoguesBy==mm.dialoguesBy && this.screenplayBy==mm.screenplayBy && 
					this.storyBy==mm.storyBy && this.cinematography==mm.cinematography && this.editedBy==mm.editedBy && this.musicBy==mm.musicBy && 
					this.distributedBy==mm.distributedBy && this.productionCompany==mm.productionCompany)
				return true;
			return false;
	}

}
