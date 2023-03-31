package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.C8941f1;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ImageResourceConfig implements Serializable {
    private static final long serialVersionUID = -8927634568015374287L;

    /* renamed from: a */
    public transient Bitmap f38740a;

    /* renamed from: b */
    public transient Bitmap f38741b;

    /* renamed from: c */
    public transient Bitmap f38742c = null;
    private int height = 1;
    private String imageFallbackUrl = "";
    private String imageUrlSecured = "";
    private String name;
    private int width = 1;

    private ImageResourceConfig() {
    }

    /* renamed from: a */
    public Bitmap mo30628a(Context context) {
        if (this.f38742c == null) {
            Bitmap bitmap = this.f38740a;
            this.f38742c = bitmap;
            if (bitmap == null) {
                if (this.f38741b == null) {
                    this.f38741b = C8941f1.m48561a(context, this.imageFallbackUrl);
                }
                this.f38742c = this.f38741b;
            }
        }
        return this.f38742c;
    }

    /* renamed from: b */
    public void mo30631b(int i) {
        this.width = i;
    }

    /* renamed from: c */
    public String mo30633c() {
        return this.name;
    }

    /* renamed from: d */
    public int mo30634d() {
        return this.width;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageResourceConfig imageResourceConfig = (ImageResourceConfig) obj;
        if (this.width != imageResourceConfig.width || this.height != imageResourceConfig.height || !C9605vb.m50465a(this.imageUrlSecured, imageResourceConfig.imageUrlSecured) || !C9605vb.m50465a(this.imageFallbackUrl, imageResourceConfig.imageFallbackUrl) || !C9605vb.m50465a(this.name, imageResourceConfig.name)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.imageUrlSecured, this.imageFallbackUrl, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: b */
    public String mo30630b() {
        String str = this.imageUrlSecured;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public void mo30632b(String str) {
        this.imageFallbackUrl = str;
    }

    /* renamed from: a */
    public int mo30627a() {
        return this.height;
    }

    /* renamed from: a */
    public void mo30629a(int i) {
        this.height = i;
    }

    /* renamed from: a */
    public static ImageResourceConfig m49827a(String str) {
        ImageResourceConfig imageResourceConfig = new ImageResourceConfig();
        imageResourceConfig.name = str;
        return imageResourceConfig;
    }
}
