package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class yo1 implements q73 {

    /* renamed from: a */
    public final /* synthetic */ String f20763a;

    /* renamed from: b */
    public final /* synthetic */ double f20764b;

    /* renamed from: c */
    public final /* synthetic */ int f20765c;

    /* renamed from: d */
    public final /* synthetic */ int f20766d;

    public /* synthetic */ yo1(String str, double d, int i, int i2) {
        this.f20763a = str;
        this.f20764b = d;
        this.f20765c = i;
        this.f20766d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f20763a;
        return new d20(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f20764b, this.f20765c, this.f20766d);
    }
}
