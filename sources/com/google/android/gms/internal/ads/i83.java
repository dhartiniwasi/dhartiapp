package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class i83 extends n83 {

    /* renamed from: g */
    final /* synthetic */ j83 f10671g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i83(j83 j83, p83 p83, CharSequence charSequence) {
        super(p83, charSequence);
        this.f10671g = j83;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo11056d(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo11057e(int i) {
        n73 n73 = this.f10671g.f11272a;
        CharSequence charSequence = this.f13905c;
        int length = charSequence.length();
        b83.m10238b(i, length, "index");
        while (i < length) {
            if (n73.mo11614a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
