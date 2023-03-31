package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.IOException;
import p040e5.C4240a;
import p040e5.C4243c;
import p040e5.C4244d;
import p053g4.C4409t;
import p067i5.C4697k;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wg0 extends C4240a {
    public static final Parcelable.Creator<wg0> CREATOR = new xg0();

    /* renamed from: a */
    ParcelFileDescriptor f19620a;

    /* renamed from: b */
    private Parcelable f19621b = null;

    /* renamed from: c */
    private boolean f19622c = true;

    public wg0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f19620a = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: I1 */
    public final C4244d mo14922I1(Parcelable.Creator creator) {
        if (this.f19622c) {
            if (this.f19620a == null) {
                pm0.m18664d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f19620a));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                C4697k.m30405a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f19621b = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f19622c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                pm0.m18665e("Could not read from parcel file descriptor", e);
                C4697k.m30405a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C4697k.m30405a(dataInputStream);
                throw th2;
            }
        }
        return (C4244d) this.f19621b;
    }

    /* JADX INFO: finally extract failed */
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f19620a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f19621b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        dn0.f8325a.execute(new ug0(autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                    pm0.m18665e("Error transporting the ad response", e);
                    C4409t.m29325q().mo15126t(e, "LargeParcelTeleporter.pipeData.2");
                    C4697k.m30405a(autoCloseOutputStream);
                    this.f19620a = parcelFileDescriptor;
                    int a = C4243c.m28604a(parcel);
                    C4243c.m28619p(parcel, 2, this.f19620a, i, false);
                    C4243c.m28605b(parcel, a);
                }
                this.f19620a = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a2 = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 2, this.f19620a, i, false);
        C4243c.m28605b(parcel, a2);
    }
}
