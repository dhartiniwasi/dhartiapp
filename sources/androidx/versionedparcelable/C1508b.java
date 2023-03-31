package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p124r.C5413a;

/* renamed from: androidx.versionedparcelable.b */
/* compiled from: VersionedParcelParcel */
class C1508b extends C1506a {

    /* renamed from: d */
    private final SparseIntArray f4349d;

    /* renamed from: e */
    private final Parcel f4350e;

    /* renamed from: f */
    private final int f4351f;

    /* renamed from: g */
    private final int f4352g;

    /* renamed from: h */
    private final String f4353h;

    /* renamed from: i */
    private int f4354i;

    /* renamed from: j */
    private int f4355j;

    /* renamed from: k */
    private int f4356k;

    C1508b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5413a(), new C5413a(), new C5413a());
    }

    /* renamed from: D */
    public String mo5934D() {
        return this.f4350e.readString();
    }

    /* renamed from: F */
    public IBinder mo5936F() {
        return this.f4350e.readStrongBinder();
    }

    /* renamed from: J */
    public void mo5940J(int i) {
        mo5955a();
        this.f4354i = i;
        this.f4349d.put(i, this.f4350e.dataPosition());
        mo5952X(0);
        mo5952X(i);
    }

    /* renamed from: L */
    public void mo5942L(boolean z) {
        this.f4350e.writeInt(z ? 1 : 0);
    }

    /* renamed from: N */
    public void mo5944N(Bundle bundle) {
        this.f4350e.writeBundle(bundle);
    }

    /* renamed from: P */
    public void mo5946P(byte[] bArr) {
        if (bArr != null) {
            this.f4350e.writeInt(bArr.length);
            this.f4350e.writeByteArray(bArr);
            return;
        }
        this.f4350e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo5948R(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4350e, 0);
    }

    /* renamed from: V */
    public void mo5950V(float f) {
        this.f4350e.writeFloat(f);
    }

    /* renamed from: X */
    public void mo5952X(int i) {
        this.f4350e.writeInt(i);
    }

    /* renamed from: a */
    public void mo5955a() {
        int i = this.f4354i;
        if (i >= 0) {
            int i2 = this.f4349d.get(i);
            int dataPosition = this.f4350e.dataPosition();
            this.f4350e.setDataPosition(i2);
            this.f4350e.writeInt(dataPosition - i2);
            this.f4350e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a0 */
    public void mo5956a0(long j) {
        this.f4350e.writeLong(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1506a mo5957b() {
        Parcel parcel = this.f4350e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4355j;
        if (i == this.f4351f) {
            i = this.f4352g;
        }
        int i2 = i;
        return new C1508b(parcel, dataPosition, i2, this.f4353h + "  ", this.f4345a, this.f4346b, this.f4347c);
    }

    /* renamed from: c0 */
    public void mo5959c0(Parcelable parcelable) {
        this.f4350e.writeParcelable(parcelable, 0);
    }

    /* renamed from: g0 */
    public void mo5963g0(String str) {
        this.f4350e.writeString(str);
    }

    /* renamed from: h */
    public boolean mo5964h() {
        return this.f4350e.readInt() != 0;
    }

    /* renamed from: i0 */
    public void mo5967i0(IBinder iBinder) {
        this.f4350e.writeStrongBinder(iBinder);
    }

    /* renamed from: j */
    public Bundle mo5968j() {
        return this.f4350e.readBundle(getClass().getClassLoader());
    }

    /* renamed from: l */
    public byte[] mo5972l() {
        int readInt = this.f4350e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4350e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public CharSequence mo5976n() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4350e);
    }

    /* renamed from: q */
    public boolean mo5978q(int i) {
        while (this.f4355j < this.f4352g) {
            int i2 = this.f4356k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4350e.setDataPosition(this.f4355j);
            int readInt = this.f4350e.readInt();
            this.f4356k = this.f4350e.readInt();
            this.f4355j += readInt;
        }
        if (this.f4356k == i) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public float mo5979r() {
        return this.f4350e.readFloat();
    }

    /* renamed from: u */
    public int mo5982u() {
        return this.f4350e.readInt();
    }

    /* renamed from: x */
    public long mo5985x() {
        return this.f4350e.readLong();
    }

    /* renamed from: z */
    public <T extends Parcelable> T mo5987z() {
        return this.f4350e.readParcelable(getClass().getClassLoader());
    }

    private C1508b(Parcel parcel, int i, int i2, String str, C5413a<String, Method> aVar, C5413a<String, Method> aVar2, C5413a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4349d = new SparseIntArray();
        this.f4354i = -1;
        this.f4355j = 0;
        this.f4356k = -1;
        this.f4350e = parcel;
        this.f4351f = i;
        this.f4352g = i2;
        this.f4355j = i;
        this.f4353h = str;
    }
}
