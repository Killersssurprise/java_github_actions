package org.example.books;

public interface OnDownload {

    void onDownloadedComplete();
    void onDownloadFail();

    void download();

}
