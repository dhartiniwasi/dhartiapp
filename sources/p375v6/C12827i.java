package p375v6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: v6.i */
/* compiled from: RelativeCornerSize */
public final class C12827i implements C12818c {

    /* renamed from: a */
    private final float f46872a;

    public C12827i(float f) {
        this.f46872a = f;
    }

    /* renamed from: a */
    public float mo37727a(RectF rectF) {
        return this.f46872a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C12827i) && this.f46872a == ((C12827i) obj).f46872a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f46872a)});
    }
}
