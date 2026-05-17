package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.DocumentEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.Document;

public class DocumentMapper {

    public static DocumentEmbeddable toEmbeddable(
            Document domain
    ) {

        if (domain == null) {
            return null;
        }

         return  new DocumentEmbeddable(
                domain.getValue()
        );
    }

    public static Document toDomain(
            DocumentEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new Document(
                embeddable.getValue()
        );
    }
}
