/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.methotels.data;

import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author Ana
 */
public class Soba {

    private String nazivSobe;
    private String sprat;
    private boolean tv;
    private boolean internet;
    private boolean djakuzi;

    @Inject
    public Soba() {

    }

    public Soba(String nazivSobe, String sprat, boolean tv, boolean internet, boolean djakuzi) {
        this.nazivSobe = nazivSobe;
        this.sprat = sprat;
        this.tv = tv;
        this.internet = internet;
        this.djakuzi = djakuzi;
    }

    public String getNazivSobe() {
        return nazivSobe;
    }

    public void setNazivSobe(String nazivSobe) {
        this.nazivSobe = nazivSobe;
    }

    public String getSprat() {
        return sprat;
    }

    public void setSprat(String sprat) {
        this.sprat = sprat;
    }

    public boolean getTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean getInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean getDjakuzi() {
        return djakuzi;
    }

    public void setDjakuzi(boolean djakuzi) {
        this.djakuzi = djakuzi;
    }

}
