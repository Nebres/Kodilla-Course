package com.kodilla.patterns2.adapter.bookclasifier.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistic;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MedianAdaptee implements BookStatistic {

    private final Statistics statistics;

    public MedianAdaptee(Statistics statistics) {
        this.statistics = statistics;
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistics.averagePublicationYear(books);
}

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }

}
