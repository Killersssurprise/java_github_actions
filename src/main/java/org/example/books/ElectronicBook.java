package org.example.books;

public class ElectronicBook extends BaseBook implements IBook, OnDownload{

    private int sizeMB = 0;

    public ElectronicBook(String author, int year, String name, int sizeMB) {
        super(author, year, name);
        this.sizeMB = sizeMB;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("SizeMB: "+this.sizeMB);
//        System.out.println();
    }

    @Override
    public int getPagesCount() {
        return 100;
    }

    @Override
    public void getDescription() {
        System.out.println("Это электронная книга! ");
    }

    @Override
    public void onDownloadedComplete() {
        System.out.println("Книга загружена! ");
    }

    @Override
    public void onDownloadFail() {
        System.out.println("Книга не загружена! ");
    }

    @Override
    public void download() {
        System.out.println("Загружаем книгу! ");
    }
}
