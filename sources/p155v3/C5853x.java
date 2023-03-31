package p155v3;

import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import p155v3.C5804g0;
import p155v3.C5810h0;
import p177z1.C6249m2;

/* renamed from: v3.x */
/* compiled from: DefaultLoadErrorHandlingPolicy */
public class C5853x implements C5804g0 {

    /* renamed from: a */
    private final int f28983a;

    public C5853x() {
        this(-1);
    }

    /* renamed from: a */
    public C5804g0.C5806b mo20329a(C5804g0.C5805a aVar, C5804g0.C5807c cVar) {
        if (!mo20408e(cVar.f28813c)) {
            return null;
        }
        if (aVar.mo20333a(1)) {
            return new C5804g0.C5806b(1, 300000);
        }
        if (aVar.mo20333a(2)) {
            return new C5804g0.C5806b(2, 60000);
        }
        return null;
    }

    /* renamed from: b */
    public /* synthetic */ void mo20330b(long j) {
        C5802f0.m34551a(this, j);
    }

    /* renamed from: c */
    public long mo20331c(C5804g0.C5807c cVar) {
        IOException iOException = cVar.f28813c;
        if ((iOException instanceof C6249m2) || (iOException instanceof FileNotFoundException) || (iOException instanceof C5857z) || (iOException instanceof C5810h0.C5818h) || C5830m.m34613a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((cVar.f28814d - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    /* renamed from: d */
    public int mo20332d(int i) {
        int i2 = this.f28983a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo20408e(IOException iOException) {
        if (!(iOException instanceof C5794c0)) {
            return false;
        }
        int i = ((C5794c0) iOException).f28789d;
        if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
            return true;
        }
        return false;
    }

    public C5853x(int i) {
        this.f28983a = i;
    }
}
