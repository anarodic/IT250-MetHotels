/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.methotels.pages;

import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import com.metropolitan.methotels.data.Soba;
import org.apache.tapestry5.annotations.Persist;

/**
 *
 * @author Ana
 */
public class DodavanjeSoba {

    @Persist
    @Property
    private ArrayList<Soba> sobe;
    @Property
    private Soba soba;

    void onActivate() {
        if (sobe == null) {
            sobe = new ArrayList<Soba>();
        }
    }

    Object onSuccess() {
        sobe.add(soba);
        return this;
    }
}
