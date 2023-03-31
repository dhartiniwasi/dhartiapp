package p025c8;

import android.database.Cursor;
import com.google.protobuf.C8135e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p025c8.C6831x2;
import p211d8.C9888l;
import p211d8.C9903u;
import p220e8.C10009f;
import p220e8.C10014k;
import p247h8.C10432b;
import p247h8.C10455m;
import p247h8.C10460p;
import p247h8.C10472x;
import p404y7.C13073j;
import p405y8.C13093c0;

/* renamed from: c8.s1 */
/* compiled from: SQLiteDocumentOverlayCache */
public class C6822s1 implements C6775b {

    /* renamed from: a */
    private final C6831x2 f31431a;

    /* renamed from: b */
    private final C6810o f31432b;

    /* renamed from: c */
    private final String f31433c;

    public C6822s1(C6831x2 x2Var, C6810o oVar, C13073j jVar) {
        this.f31431a = x2Var;
        this.f31432b = oVar;
        this.f31433c = jVar.mo38099b() ? jVar.mo38098a() : "";
    }

    /* renamed from: m */
    private C10014k m39167m(byte[] bArr, int i) {
        try {
            return C10014k.m51138a(i, this.f31432b.mo22864e(C13093c0.m61534x0(bArr)));
        } catch (C8135e0 e) {
            throw C10432b.m52645a("Overlay failed to parse: %s", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ C10014k m39168n(Cursor cursor) {
        return m39167m(cursor.getBlob(0), cursor.getInt(1));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m39170p(int[] iArr, String[] strArr, String[] strArr2, C10455m mVar, Map map, Cursor cursor) {
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        m39173s(mVar, map, cursor);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m39172r(byte[] bArr, int i, Map map) {
        C10014k m = m39167m(bArr, i);
        synchronized (map) {
            map.put(m.mo32625b(), m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m39173s(C10455m mVar, Map<C9888l, C10014k> map, Cursor cursor) {
        byte[] blob = cursor.getBlob(0);
        int i = cursor.getInt(1);
        Executor executor = mVar;
        if (cursor.isLast()) {
            executor = C10460p.f41438b;
        }
        executor.execute(new C1938r1(this, blob, i, map));
    }

    /* renamed from: u */
    private void m39175u(Map<C9888l, C10014k> map, C10455m mVar, C9903u uVar, List<Object> list) {
        if (!list.isEmpty()) {
            C6831x2.C6833b bVar = new C6831x2.C6833b(this.f31431a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(new Object[]{this.f31433c, C6789f.m38862c(uVar)}), list, ")");
            while (bVar.mo22922d()) {
                bVar.mo22923e().mo22932e(new C1926o1(this, mVar, map));
            }
        }
    }

    /* renamed from: v */
    private void m39176v(int i, C9888l lVar, C10009f fVar) {
        String p = lVar.mo32387p();
        String c = C6789f.m38862c((C9903u) lVar.mo32390s().mo32360t());
        String n = lVar.mo32390s().mo32354n();
        this.f31431a.mo22914v("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f31433c, p, c, n, Integer.valueOf(i), this.f31432b.mo22870n(fVar).mo26773h());
    }

    /* renamed from: a */
    public Map<C9888l, C10014k> mo22718a(SortedSet<C9888l> sortedSet) {
        C10432b.m52648d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap hashMap = new HashMap();
        C10455m mVar = new C10455m();
        C9903u uVar = C9903u.f39750b;
        ArrayList arrayList = new ArrayList();
        for (C9888l lVar : sortedSet) {
            if (!uVar.equals(lVar.mo32388q())) {
                m39175u(hashMap, mVar, uVar, arrayList);
                uVar = lVar.mo32388q();
                arrayList.clear();
            }
            arrayList.add(lVar.mo32389r());
        }
        m39175u(hashMap, mVar, uVar, arrayList);
        mVar.mo33539c();
        return hashMap;
    }

    /* renamed from: b */
    public void mo22719b(int i) {
        this.f31431a.mo22914v("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f31433c, Integer.valueOf(i));
    }

    /* renamed from: c */
    public C10014k mo22720c(C9888l lVar) {
        String c = C6789f.m38862c((C9903u) lVar.mo32390s().mo32360t());
        String n = lVar.mo32390s().mo32354n();
        return (C10014k) this.f31431a.mo22912E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").mo22929b(this.f31433c, c, n).mo22931d(new C1935q1(this));
    }

    /* renamed from: d */
    public void mo22721d(int i, Map<C9888l, C10009f> map) {
        for (Map.Entry next : map.entrySet()) {
            C9888l lVar = (C9888l) next.getKey();
            m39176v(i, lVar, (C10009f) C10472x.m52787d((C10009f) next.getValue(), "null value for key: %s", lVar));
        }
    }

    /* renamed from: e */
    public Map<C9888l, C10014k> mo22722e(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        String[] strArr = new String[1];
        String[] strArr2 = new String[1];
        int[] iArr = new int[1];
        C10455m mVar = new C10455m();
        C1931p1 p1Var = r0;
        C1931p1 p1Var2 = new C1931p1(this, iArr, strArr, strArr2, mVar, hashMap);
        this.f31431a.mo22912E("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").mo22929b(this.f31433c, str, Integer.valueOf(i), Integer.valueOf(i2)).mo22932e(p1Var);
        if (strArr[0] == null) {
            return hashMap;
        }
        this.f31431a.mo22912E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?").mo22929b(this.f31433c, str, strArr[0], strArr[0], strArr2[0], Integer.valueOf(iArr[0])).mo22932e(new C1923n1(this, mVar, hashMap));
        mVar.mo33539c();
        return hashMap;
    }

    /* renamed from: f */
    public Map<C9888l, C10014k> mo22723f(C9903u uVar, int i) {
        HashMap hashMap = new HashMap();
        C10455m mVar = new C10455m();
        this.f31431a.mo22912E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").mo22929b(this.f31433c, C6789f.m38862c(uVar), Integer.valueOf(i)).mo22932e(new C1919m1(this, mVar, hashMap));
        mVar.mo33539c();
        return hashMap;
    }
}
