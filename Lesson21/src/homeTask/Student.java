package homeTask;

class Student {
	private StringBuilder name;
	private int course;
	private int grade;
	
	public void setName(String name) {
		if(name.length() > 2) {
			this.name = new StringBuilder(name);
		}
		else System.out.println("Слишком короткое имя. Введите полное имя.");
	}
	
	public void setGrade(int grade) {
		if(grade > 0 && grade < 11) {
			this.grade = grade;
		}
		else System.out.println("Введена неверная оценка. Введите целочисленную оценку от 1 до 10.");
	}
	
	public void setCourse(int course) {
		if(course > 0 && course < 4) {
			this.course = course;
		}
		else {
			System.out.println("Введено неверное значение. Введите верное значение от 1 до 4.");
		}
		
	}
	
	public void showInfo() {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("Имя студента: ").append(name).append(System.getProperty("line.separator")).
			append("Оценка студента: ").append(grade).append(System.getProperty("line.separator")).
			append("Курс на котором учится студент: ").append(course));
	}

}