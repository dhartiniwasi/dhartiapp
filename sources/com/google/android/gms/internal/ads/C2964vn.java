package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.vn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2964vn {

    /* renamed from: a */
    private final C2961vk[] f19164a;

    /* renamed from: b */
    private final C3035xk f19165b;

    /* renamed from: c */
    private C2961vk f19166c;

    public C2964vn(C2961vk[] vkVarArr, C3035xk xkVar) {
        this.f19164a = vkVarArr;
        this.f19165b = xkVar;
    }

    /* renamed from: a */
    public final void mo14794a() {
        if (this.f19166c != null) {
            this.f19166c = null;
        }
    }

    /* renamed from: b */
    public final C2961vk mo14795b(C2924uk ukVar, Uri uri) throws IOException, InterruptedException {
        C2961vk vkVar = this.f19166c;
        if (vkVar != null) {
            return vkVar;
        }
        C2961vk[] vkVarArr = this.f19164a;
        int length = vkVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C2961vk vkVar2 = vkVarArr[i];
            try {
                if (vkVar2.mo10568b(ukVar)) {
                    this.f19166c = vkVar2;
                    ukVar.mo14525e();
                    break;
                }
                ukVar.mo14525e();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                ukVar.mo14525e();
                throw th;
            }
        }
        C2961vk vkVar3 = this.f19166c;
        if (vkVar3 != null) {
            vkVar3.mo10570f(this.f19165b);
            return this.f19166c;
        }
        String k = C2893tq.m21180k(this.f19164a);
        throw new C2928uo("None of the available extractors (" + k + ") could read the stream.", uri);
    }
}
