package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class l34 implements Iterator, Closeable, C2320eb {

    /* renamed from: g */
    private static final C2283db f12638g = new k34("eof ");

    /* renamed from: h */
    private static final t34 f12639h = t34.m20792b(l34.class);

    /* renamed from: a */
    protected C2172ab f12640a;

    /* renamed from: b */
    protected m34 f12641b;

    /* renamed from: c */
    C2283db f12642c = null;

    /* renamed from: d */
    long f12643d = 0;

    /* renamed from: e */
    long f12644e = 0;

    /* renamed from: f */
    private final List f12645f = new ArrayList();

    public void close() throws IOException {
    }

    /* renamed from: g */
    public final C2283db next() {
        C2283db a;
        C2283db dbVar = this.f12642c;
        if (dbVar == null || dbVar == f12638g) {
            m34 m34 = this.f12641b;
            if (m34 == null || this.f12643d >= this.f12644e) {
                this.f12642c = f12638g;
                throw new NoSuchElementException();
            }
            try {
                synchronized (m34) {
                    this.f12641b.mo12273l(this.f12643d);
                    a = this.f12640a.mo8296a(this.f12641b, this);
                    this.f12643d = this.f12641b.mo12271d();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f12642c = null;
            return dbVar;
        }
    }

    /* renamed from: h */
    public final List mo11889h() {
        return (this.f12641b == null || this.f12642c == f12638g) ? this.f12645f : new r34(this.f12645f, this);
    }

    public final boolean hasNext() {
        C2283db dbVar = this.f12642c;
        if (dbVar == f12638g) {
            return false;
        }
        if (dbVar != null) {
            return true;
        }
        try {
            this.f12642c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f12642c = f12638g;
            return false;
        }
    }

    /* renamed from: m */
    public final void mo11891m(m34 m34, long j, C2172ab abVar) throws IOException {
        this.f12641b = m34;
        this.f12643d = m34.mo12271d();
        m34.mo12273l(m34.mo12271d() + j);
        this.f12644e = m34.mo12271d();
        this.f12640a = abVar;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f12645f.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((C2283db) this.f12645f.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
