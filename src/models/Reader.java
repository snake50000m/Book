package models;

import java.util.Arrays;

public class Reader {
    private String fio;
    private long readerNum;
    private String faculty;
    private String birthDay;
    private String phone;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public long getReaderNum() {
        return readerNum;
    }

    public void setReaderNum(long readerNum) {
        this.readerNum = readerNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Reader(String fio, long readerNum, String faculty, String birthDay, String phone) {
        this.fio = fio;
        this.readerNum = readerNum;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phone = phone;
    }

    public Reader() {
    }

    public void takeBook(int bookCount) {
        if (bookCount == 1) {
            System.out.printf("Студент %s из факультета %s взял %d книгу\n", fio, faculty, bookCount);
        } else if (bookCount > 1 && bookCount < 5) {
            System.out.printf("Студент %s из факультета %s взял %d книги\n", fio, faculty, bookCount);
        }else{
            System.out.printf("Студент %s из факультета %s взял %d книг\n", fio, faculty, bookCount);
        }
    }
    public void takeBook(Book[] books){
        if(books.length==1){
            System.out.printf("Студент %s из факультета %s взял книгу %s \n", fio, faculty, books[0]);
        }else {
            System.out.printf("Студент %s из факультета %s взял книги %s \n", fio, faculty, Arrays.toString(books).substring(1, Arrays.toString(books).length()-1));

        }
    }
}
