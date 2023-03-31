package p375v6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: v6.b */
/* compiled from: AdjustedCornerSize */
public final class C12817b implements C12818c {

    /* renamed from: a */
    private final C12818c f46822a;

    /* renamed from: b */
    private final float f46823b;

    public C12817b(float f, C12818c cVar) {
        while (cVar instanceof C12817b) {
            cVar = ((C12817b) cVar).f46822a;
            f += ((C12817b) cVar).f46823b;
        }
        this.f46822a = cVar;
        this.f46823b = f;
    }

    /* renamed from: a */
    public float mo37727a(RectF rectF) {
        return Math.max(0.0f, this.f46822a.mo37727a(rectF) + this.f46823b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12817b)) {
            return false;
        }
        C12817b bVar = (C12817b) obj;
        if (!this.f46822a.equals(bVar.f46822a) || this.f46823b != bVar.f46823b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46822a, Float.valueOf(this.f46823b)});
    }
}
