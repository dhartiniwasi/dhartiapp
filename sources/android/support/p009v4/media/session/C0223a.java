package android.support.p009v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p009v4.media.MediaMetadataCompat;
import android.support.p009v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* compiled from: IMediaControllerCallback */
public interface C0223a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    /* compiled from: IMediaControllerCallback */
    public static abstract class C0224a extends Binder implements C0223a {

        /* renamed from: android.support.v4.media.session.a$a$a */
        /* compiled from: IMediaControllerCallback */
        private static class C0225a implements C0223a {

            /* renamed from: b */
            public static C0223a f545b;

            /* renamed from: a */
            private IBinder f546a;

            C0225a(IBinder iBinder) {
                this.f546a = iBinder;
            }

            /* renamed from: F6 */
            public void mo424F6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f546a.transact(8, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo424F6(parcelableVolumeInfo);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: S4 */
            public void mo455S4(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    if (this.f546a.transact(12, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo455S4(i);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f546a;
            }

            /* renamed from: b4 */
            public void mo427b4() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f546a.transact(2, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo427b4();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g4 */
            public void mo428g4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f546a.transact(4, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo428g4(mediaMetadataCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: h3 */
            public void mo457h3(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f546a.transact(11, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo457h3(z);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: p2 */
            public void mo429p2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    if (this.f546a.transact(5, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo429p2(list);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: v6 */
            public void mo458v6(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f546a.transact(3, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo458v6(playbackStateCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: y0 */
            public void mo460y0(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    if (this.f546a.transact(9, obtain, (Parcel) null, 1) || C0224a.m1142B0() == null) {
                        obtain.recycle();
                    } else {
                        C0224a.m1142B0().mo460y0(i);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0224a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: B0 */
        public static C0223a m1142B0() {
            return C0225a.f545b;
        }

        /* renamed from: p */
        public static C0223a m1143p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0223a)) {
                return new C0225a(iBinder);
            }
            return (C0223a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: type inference failed for: r3v22 */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r5 == r0) goto L_0x00e7
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00cd;
                    case 2: goto L_0x00c6;
                    case 3: goto L_0x00b0;
                    case 4: goto L_0x009a;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0077;
                    case 7: goto L_0x0061;
                    case 8: goto L_0x004b;
                    case 9: goto L_0x0040;
                    case 10: goto L_0x0032;
                    case 11: goto L_0x0024;
                    case 12: goto L_0x0019;
                    case 13: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                r4.mo456a2()
                return r1
            L_0x0019:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo455S4(r5)
                return r1
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002e
                r0 = 1
            L_0x002e:
                r4.mo457h3(r0)
                return r1
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.mo454K3(r0)
                return r1
            L_0x0040:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo460y0(r5)
                return r1
            L_0x004b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x005d
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.p009v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.p009v4.media.session.ParcelableVolumeInfo) r3
            L_0x005d:
                r4.mo424F6(r3)
                return r1
            L_0x0061:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0073
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0073:
                r4.mo426b2(r3)
                return r1
            L_0x0077:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0089
                android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L_0x0089:
                r4.mo425N3(r3)
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.p009v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r5 = r6.createTypedArrayList(r5)
                r4.mo429p2(r5)
                return r1
            L_0x009a:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.p009v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.p009v4.media.MediaMetadataCompat) r3
            L_0x00ac:
                r4.mo428g4(r3)
                return r1
            L_0x00b0:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00c2
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.p009v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.p009v4.media.session.PlaybackStateCompat) r3
            L_0x00c2:
                r4.mo458v6(r3)
                return r1
            L_0x00c6:
                r6.enforceInterface(r2)
                r4.mo427b4()
                return r1
            L_0x00cd:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x00e3
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00e3:
                r4.mo459w6(r5, r3)
                return r1
            L_0x00e7:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.media.session.C0223a.C0224a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: F6 */
    void mo424F6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: K3 */
    void mo454K3(boolean z) throws RemoteException;

    /* renamed from: N3 */
    void mo425N3(CharSequence charSequence) throws RemoteException;

    /* renamed from: S4 */
    void mo455S4(int i) throws RemoteException;

    /* renamed from: a2 */
    void mo456a2() throws RemoteException;

    /* renamed from: b2 */
    void mo426b2(Bundle bundle) throws RemoteException;

    /* renamed from: b4 */
    void mo427b4() throws RemoteException;

    /* renamed from: g4 */
    void mo428g4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* renamed from: h3 */
    void mo457h3(boolean z) throws RemoteException;

    /* renamed from: p2 */
    void mo429p2(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    /* renamed from: v6 */
    void mo458v6(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* renamed from: w6 */
    void mo459w6(String str, Bundle bundle) throws RemoteException;

    /* renamed from: y0 */
    void mo460y0(int i) throws RemoteException;
}
