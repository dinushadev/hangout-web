package com.docchannel.impl;

import junit.framework.TestCase;

import com.hangout.Bean;
import com.hangout.impl.BeanImpl;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}