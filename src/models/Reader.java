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

    public void takeBook(String[] booksName){
        if(booksName.length==1){
            System.out.printf("Студент %s из факультета %s взял книгу %s \n", fio, faculty, booksName[0]);
        }else {
            System.out.printf("Студент %s из факультета %s взял книги", fio, faculty);
            for (String a: booksName) {
                System.out.print(" " + a + ",");
            }
            System.out.println();

        }
    }

    public void takeBook(Book[] books){
        if(books.length==1){
            System.out.printf("Студент %s из факультета %s взял книгу %s \n", fio, faculty, books[0]);
        }else {
            System.out.printf("Студент %s из факультета %s взял книги %s \n", fio, faculty, Arrays.toString(books).substring(1, Arrays.toString(books).length()-1));

        }
    }

    public void returnBook(int bookCount) {
        if (bookCount == 1) {
            System.out.printf("Студент %s из факультета %s вернул %d книгу\n", fio, faculty, bookCount);
        } else if (bookCount > 1 && bookCount < 5) {
            System.out.printf("Студент %s из факультета %s вернул %d книги\n", fio, faculty, bookCount);
        }else{
            System.out.printf("Студент %s из факультета %s вернул %d книг\n", fio, faculty, bookCount);
        }
    }

    public void returnBook(String[] booksName){
        if(booksName.length==1){
            System.out.printf("Студент %s из факультета %s вернул книгу %s \n", fio, faculty, booksName[0]);
        }else {
            System.out.printf("Студент %s из факультета %s вернул книги", fio, faculty);
            for (String a: booksName) {
                System.out.print(" " + a + ",");
            }
            System.out.println();

        }
    }

    public void returnBook(Book[] books){
        if(books.length==1){
            System.out.printf("Студент %s из факультета %s вернул книгу %s \n", fio, faculty, books[0]);
        }else {
            System.out.printf("Студент %s из факультета %s вернул книги %s \n", fio, faculty, Arrays.toString(books).substring(1, Arrays.toString(books).length()-1));

        }
    }
}
