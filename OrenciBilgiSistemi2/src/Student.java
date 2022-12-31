public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    double fizikAvarage;
    double kimyaAvarage;
    double matematikAvarege;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    
    public void addBulkVerbalNote(int verMat, int verFizik, int verKimya) {

        if (verMat >= 0 && verMat <= 100) {
            this.mat.verbalNote = verMat;
        }

        if (verFizik >= 0 && verFizik <= 100) {
            this.fizik.verbalNote = verFizik;
        }

        if (verKimya >= 0 && verKimya <= 100) {
            this.kimya.verbalNote = verKimya;
        }

    }
    

    public void calcAvarage() {
    	this.fizikAvarage= (this.fizik.note*80)/100 +(this.fizik.verbalNote*20) /100;
        this.kimyaAvarage= (this.kimya.note*80)/100+(this.kimya.verbalNote*20)/100;
        this.matematikAvarege=(this.mat.note*80)/100+(this.mat.verbalNote*20)/100;
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.verbalNote == 0 || this.fizik.verbalNote == 0 || this.kimya.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note +  "  | Sözlü Notu : "+this.mat.verbalNote+ "  | Matematik Ortalama : "+ matematikAvarege);
        System.out.println("Fizik Notu : " + this.fizik.note + "  | Sözlü Notu : "+this.fizik.verbalNote+"  | Fizik Ortalama : "+ fizikAvarage);
        System.out.println("Kimya Notu : " + this.kimya.note + "  | Sözlü Notu : "+this.kimya.verbalNote+"  | Kimya Ortalama : "+kimyaAvarage);
    }
    
   

}