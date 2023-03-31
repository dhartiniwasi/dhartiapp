package com.startapp;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.startapp.p0 */
/* compiled from: Sta */
public class C9206p0 {

    /* renamed from: a */
    public Context f38039a;

    /* renamed from: b */
    public String f38040b;

    public C9206p0(Context context, AttributeSet attributeSet) {
        this.f38039a = context;
        this.f38040b = mo29803a(attributeSet, "adTag");
    }

    /* renamed from: a */
    public final String mo29803a(AttributeSet attributeSet, String str) {
        String str2;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue((String) null, str, -1);
            if (attributeResourceValue != -1) {
                str2 = this.f38039a.getResources().getString(attributeResourceValue);
            } else {
                str2 = attributeSet.getAttributeValue((String) null, str);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }
}
