package com.cedrus.movies.Movie.model.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ResponseStatus {
    private boolean isSuccessful;
    private int statusCode;
    private String statusMessage;

    public ResponseStatus() {
        this.isSuccessful = true;
        this.statusMessage = "Success";
    }

    public ResponseStatus(int statusCode) {
        this();
        this.statusCode = statusCode;
    }
}
