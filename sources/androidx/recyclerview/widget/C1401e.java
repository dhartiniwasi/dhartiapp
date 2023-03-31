package androidx.recyclerview.widget;

import androidx.core.p010os.C0777m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: GapWorker */
final class C1401e implements Runnable {

    /* renamed from: e */
    static final ThreadLocal<C1401e> f3999e = new ThreadLocal<>();

    /* renamed from: f */
    static Comparator<C1404c> f4000f = new C1402a();

    /* renamed from: a */
    ArrayList<RecyclerView> f4001a = new ArrayList<>();

    /* renamed from: b */
    long f4002b;

    /* renamed from: c */
    long f4003c;

    /* renamed from: d */
    private ArrayList<C1404c> f4004d = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* compiled from: GapWorker */
    static class C1402a implements Comparator<C1404c> {
        C1402a() {
        }

        /* renamed from: a */
        public int compare(C1404c cVar, C1404c cVar2) {
            RecyclerView recyclerView = cVar.f4012d;
            if ((recyclerView == null) != (cVar2.f4012d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f4009a;
            if (z == cVar2.f4009a) {
                int i = cVar2.f4010b - cVar.f4010b;
                if (i != 0) {
                    return i;
                }
                int i2 = cVar.f4011c - cVar2.f4011c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (z) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* compiled from: GapWorker */
    static class C1403b implements RecyclerView.C1350o.C1353c {

        /* renamed from: a */
        int f4005a;

        /* renamed from: b */
        int f4006b;

        /* renamed from: c */
        int[] f4007c;

        /* renamed from: d */
        int f4008d;

        C1403b() {
        }

        /* renamed from: a */
        public void mo5212a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4008d * 2;
                int[] iArr = this.f4007c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4007c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4007c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4007c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4008d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5465b() {
            int[] iArr = this.f4007c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4008d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5466c(RecyclerView recyclerView, boolean z) {
            this.f4008d = 0;
            int[] iArr = this.f4007c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C1350o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.mo5197u0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo5386p()) {
                        oVar.mo4762p(recyclerView.mAdapter.mo5060c(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.mo4760o(this.f4005a, this.f4006b, recyclerView.mState, this);
                }
                int i = this.f4008d;
                if (i > oVar.f3792m) {
                    oVar.f3792m = i;
                    oVar.f3793n = z;
                    recyclerView.mRecycler.mo5245K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5467d(int i) {
            if (this.f4007c != null) {
                int i2 = this.f4008d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4007c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5468e(int i, int i2) {
            this.f4005a = i;
            this.f4006b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* compiled from: GapWorker */
    static class C1404c {

        /* renamed from: a */
        public boolean f4009a;

        /* renamed from: b */
        public int f4010b;

        /* renamed from: c */
        public int f4011c;

        /* renamed from: d */
        public RecyclerView f4012d;

        /* renamed from: e */
        public int f4013e;

        C1404c() {
        }

        /* renamed from: a */
        public void mo5469a() {
            this.f4009a = false;
            this.f4010b = 0;
            this.f4011c = 0;
            this.f4012d = null;
            this.f4013e = 0;
        }
    }

    C1401e() {
    }

    /* renamed from: b */
    private void m6536b() {
        C1404c cVar;
        int size = this.f4001a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4001a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo5466c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f4008d;
            }
        }
        this.f4004d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4001a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1403b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f4005a) + Math.abs(bVar.f4006b);
                for (int i5 = 0; i5 < bVar.f4008d * 2; i5 += 2) {
                    if (i3 >= this.f4004d.size()) {
                        cVar = new C1404c();
                        this.f4004d.add(cVar);
                    } else {
                        cVar = this.f4004d.get(i3);
                    }
                    int[] iArr = bVar.f4007c;
                    int i6 = iArr[i5 + 1];
                    cVar.f4009a = i6 <= abs;
                    cVar.f4010b = abs;
                    cVar.f4011c = i6;
                    cVar.f4012d = recyclerView2;
                    cVar.f4013e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4004d, f4000f);
    }

    /* renamed from: c */
    private void m6537c(C1404c cVar, long j) {
        RecyclerView.C1336d0 i = m6541i(cVar.f4012d, cVar.f4013e, cVar.f4009a ? Long.MAX_VALUE : j);
        if (i != null && i.f3748b != null && i.mo5029s() && !i.mo5030t()) {
            m6540h((RecyclerView) i.f3748b.get(), j);
        }
    }

    /* renamed from: d */
    private void m6538d(long j) {
        int i = 0;
        while (i < this.f4004d.size()) {
            C1404c cVar = this.f4004d.get(i);
            if (cVar.f4012d != null) {
                m6537c(cVar, j);
                cVar.mo5469a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m6539e(RecyclerView recyclerView, int i) {
        int j = recyclerView.mChildHelper.mo5403j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo5402i(i2));
            if (childViewHolderInt.f3749c == i && !childViewHolderInt.mo5030t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m6540h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mo5403j() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C1403b bVar = recyclerView.mPrefetchRegistry;
            bVar.mo5466c(recyclerView, true);
            if (bVar.f4008d != 0) {
                try {
                    C0777m.m3535a("RV Nested Prefetch");
                    recyclerView.mState.mo4986f(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.f4008d * 2; i += 2) {
                        m6541i(recyclerView, bVar.f4007c[i], j);
                    }
                } finally {
                    C0777m.m3536b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C1336d0 m6541i(RecyclerView recyclerView, int i, long j) {
        if (m6539e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1362v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C1336d0 I = vVar.mo5243I(i, false, j);
            if (I != null) {
                if (!I.mo5029s() || I.mo5030t()) {
                    vVar.mo5248a(I, false);
                } else {
                    vVar.mo5237B(I.f3747a);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void mo5458a(RecyclerView recyclerView) {
        this.f4001a.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5459f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4002b == 0) {
            this.f4002b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo5468e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5460g(long j) {
        m6536b();
        m6538d(j);
    }

    /* renamed from: j */
    public void mo5461j(RecyclerView recyclerView) {
        this.f4001a.remove(recyclerView);
    }

    public void run() {
        try {
            C0777m.m3535a("RV Prefetch");
            if (!this.f4001a.isEmpty()) {
                int size = this.f4001a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f4001a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo5460g(TimeUnit.MILLISECONDS.toNanos(j) + this.f4003c);
                    this.f4002b = 0;
                    C0777m.m3536b();
                }
            }
        } finally {
            this.f4002b = 0;
            C0777m.m3536b();
        }
    }
}
