package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p024c5.C1877a;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class DataHolder extends C4240a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C2141b();

    /* renamed from: s */
    private static final C2139a f6311s = new C2140a(new String[0], (String) null);

    /* renamed from: a */
    final int f6312a;

    /* renamed from: b */
    private final String[] f6313b;

    /* renamed from: c */
    Bundle f6314c;

    /* renamed from: d */
    private final CursorWindow[] f6315d;

    /* renamed from: e */
    private final int f6316e;

    /* renamed from: f */
    private final Bundle f6317f;

    /* renamed from: g */
    int[] f6318g;

    /* renamed from: h */
    int f6319h;

    /* renamed from: i */
    boolean f6320i = false;

    /* renamed from: r */
    private boolean f6321r = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C2139a {

        /* renamed from: a */
        private final String[] f6322a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f6323b = new ArrayList<>();

        /* renamed from: c */
        private final HashMap<Object, Integer> f6324c = new HashMap<>();

        /* synthetic */ C2139a(String[] strArr, String str, C1877a aVar) {
            this.f6322a = (String[]) C4141r.m28221k(strArr);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f6312a = i;
        this.f6313b = strArr;
        this.f6315d = cursorWindowArr;
        this.f6316e = i2;
        this.f6317f = bundle;
    }

    /* renamed from: I1 */
    public Bundle mo8126I1() {
        return this.f6317f;
    }

    /* renamed from: J1 */
    public int mo8127J1() {
        return this.f6316e;
    }

    /* renamed from: K1 */
    public boolean mo8128K1() {
        boolean z;
        synchronized (this) {
            z = this.f6320i;
        }
        return z;
    }

    /* renamed from: L1 */
    public final void mo8129L1() {
        this.f6314c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f6313b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f6314c.putInt(strArr[i2], i2);
            i2++;
        }
        this.f6318g = new int[this.f6315d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f6315d;
            if (i < cursorWindowArr.length) {
                this.f6318g[i] = i3;
                i3 += this.f6315d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f6319h = i3;
                return;
            }
        }
    }

    public void close() {
        synchronized (this) {
            if (!this.f6320i) {
                this.f6320i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f6315d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f6321r && this.f6315d.length > 0 && !mo8128K1()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28621r(parcel, 1, this.f6313b, false);
        C4243c.m28623t(parcel, 2, this.f6315d, i, false);
        C4243c.m28614k(parcel, 3, mo8127J1());
        C4243c.m28608e(parcel, 4, mo8126I1(), false);
        C4243c.m28614k(parcel, AdError.NETWORK_ERROR_CODE, this.f6312a);
        C4243c.m28605b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
