package p375v6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: v6.a */
/* compiled from: AbsoluteCornerSize */
public final class C12816a implements C12818c {

    /* renamed from: a */
    private final float f46821a;

    public C12816a(float f) {
        this.f46821a = f;
    }

    /* renamed from: a */
    public float mo37727a(RectF rectF) {
        return this.f46821a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C12816a) && this.f46821a == ((C12816a) obj).f46821a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f46821a)});
    }
}
