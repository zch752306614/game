package com.alice.game.entity;

public class GCard {
    private Integer id;

    private String cardname;

    private String cardsource;

    private Integer cardquality;

    private String carddescription;

    private Integer cardstar;

    private String cardurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname == null ? null : cardname.trim();
    }

    public String getCardsource() {
        return cardsource;
    }

    public void setCardsource(String cardsource) {
        this.cardsource = cardsource == null ? null : cardsource.trim();
    }

    public Integer getCardquality() {
        return cardquality;
    }

    public void setCardquality(Integer cardquality) {
        this.cardquality = cardquality;
    }

    public String getCarddescription() {
        return carddescription;
    }

    public void setCarddescription(String carddescription) {
        this.carddescription = carddescription == null ? null : carddescription.trim();
    }

    public Integer getCardstar() {
        return cardstar;
    }

    public void setCardstar(Integer cardstar) {
        this.cardstar = cardstar;
    }

    public String getCardurl() {
        return cardurl;
    }

    public void setCardurl(String cardurl) {
        this.cardurl = cardurl == null ? null : cardurl.trim();
    }
}