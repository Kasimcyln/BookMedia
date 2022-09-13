package com.kasimkartal866.mybookmedia;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Book {
    @PrimaryKey(autoGenerate = true)
    public int id;
    private String bookName;
    private String authorName;
    private String explanation;
    private String imageAddress;

    public Book() {
    }
    @Ignore
    public Book(String bookName, String authorName, String explanation, String imageAddress) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.explanation = explanation;
        this.imageAddress = imageAddress;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }
}
