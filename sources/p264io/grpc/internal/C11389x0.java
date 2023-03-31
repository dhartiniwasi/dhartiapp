package p264io.grpc.internal;

import java.util.ArrayList;

/* renamed from: io.grpc.internal.x0 */
/* compiled from: InsightBuilder */
public final class C11389x0 {

    /* renamed from: a */
    private final ArrayList<String> f43663a = new ArrayList<>();

    /* renamed from: a */
    public C11389x0 mo35388a(Object obj) {
        this.f43663a.add(String.valueOf(obj));
        return this;
    }

    /* renamed from: b */
    public C11389x0 mo35389b(String str, Object obj) {
        ArrayList<String> arrayList = this.f43663a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f43663a.toString();
    }
}
