package p015b3;

import android.util.SparseArray;
import p161w3.C5917a;
import p161w3.C5937h;

/* renamed from: b3.v0 */
/* compiled from: SpannedData */
final class C1769v0<V> {

    /* renamed from: a */
    private int f5275a;

    /* renamed from: b */
    private final SparseArray<V> f5276b = new SparseArray<>();

    /* renamed from: c */
    private final C5937h<V> f5277c;

    public C1769v0(C5937h<V> hVar) {
        this.f5277c = hVar;
        this.f5275a = -1;
    }

    /* renamed from: a */
    public void mo6889a(int i, V v) {
        boolean z = false;
        if (this.f5275a == -1) {
            C5917a.m34873f(this.f5276b.size() == 0);
            this.f5275a = 0;
        }
        if (this.f5276b.size() > 0) {
            SparseArray<V> sparseArray = this.f5276b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z = true;
            }
            C5917a.m34868a(z);
            if (keyAt == i) {
                C5937h<V> hVar = this.f5277c;
                SparseArray<V> sparseArray2 = this.f5276b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f5276b.append(i, v);
    }

    /* renamed from: b */
    public void mo6890b() {
        for (int i = 0; i < this.f5276b.size(); i++) {
            this.f5277c.accept(this.f5276b.valueAt(i));
        }
        this.f5275a = -1;
        this.f5276b.clear();
    }

    /* renamed from: c */
    public void mo6891c(int i) {
        int size = this.f5276b.size() - 1;
        while (size >= 0 && i < this.f5276b.keyAt(size)) {
            this.f5277c.accept(this.f5276b.valueAt(size));
            this.f5276b.removeAt(size);
            size--;
        }
        this.f5275a = this.f5276b.size() > 0 ? Math.min(this.f5275a, this.f5276b.size() - 1) : -1;
    }

    /* renamed from: d */
    public void mo6892d(int i) {
        int i2 = 0;
        while (i2 < this.f5276b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f5276b.keyAt(i3)) {
                this.f5277c.accept(this.f5276b.valueAt(i2));
                this.f5276b.removeAt(i2);
                int i4 = this.f5275a;
                if (i4 > 0) {
                    this.f5275a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public V mo6893e(int i) {
        if (this.f5275a == -1) {
            this.f5275a = 0;
        }
        while (true) {
            int i2 = this.f5275a;
            if (i2 > 0 && i < this.f5276b.keyAt(i2)) {
                this.f5275a--;
            }
        }
        while (this.f5275a < this.f5276b.size() - 1 && i >= this.f5276b.keyAt(this.f5275a + 1)) {
            this.f5275a++;
        }
        return this.f5276b.valueAt(this.f5275a);
    }

    /* renamed from: f */
    public V mo6894f() {
        SparseArray<V> sparseArray = this.f5276b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: g */
    public boolean mo6895g() {
        return this.f5276b.size() == 0;
    }
}
