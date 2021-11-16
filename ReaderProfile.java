
public class ReaderProfile {
	
	String name;
	String surname;
	String grade;
	String phoneNumber;
	int booksTkn;
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
            this.name = name;
		}
	}
	public void setSurname(String surname) {
        if(surname != null && !surname.isEmpty()) {
            this.surname = surname;
        }
    }
	public void setGrade(String grade) {
		if(grade != null && !grade.isEmpty() &&  grade.length() == 1) {
			this.grade = grade;
		}
	}
	public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber != null && phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }
	public void setBooksTkn(int booksTkn) {
		if(booksTkn >= 0) {
			this.booksTkn = booksTkn;
		}
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getGrade() {
		return grade;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getBooksTkn() {
		return booksTkn;
	}
	
	public ReaderProfile(String name, String surname, String grade, String phoneNumber, int booksTkn){
        setName(name);
        setSurname(surname);
        setGrade(grade);
        setPhoneNumber(phoneNumber);
        setBooksTkn(booksTkn);
    }
	public ReaderProfile(String name, String surname, String grade, String phoneNumber){
        setName(name);
        setSurname(surname);
        setGrade(grade);
        setPhoneNumber(phoneNumber);
    }
	
	public String toString(){
		return String.format("%s, %s, %c, %s, %d", getName(), getSurname(), getGrade(), getPhoneNumber(), getBooksTkn());
	}
}
