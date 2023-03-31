package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0681a;
import androidx.core.view.C0882b;
import androidx.core.view.C0894c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p145u.C5616a;

/* renamed from: androidx.appcompat.view.menu.g */
/* compiled from: MenuBuilder */
public class C0367g implements C5616a {

    /* renamed from: A */
    private static final int[] f1119A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1120a;

    /* renamed from: b */
    private final Resources f1121b;

    /* renamed from: c */
    private boolean f1122c;

    /* renamed from: d */
    private boolean f1123d;

    /* renamed from: e */
    private C0368a f1124e;

    /* renamed from: f */
    private ArrayList<C0371i> f1125f;

    /* renamed from: g */
    private ArrayList<C0371i> f1126g;

    /* renamed from: h */
    private boolean f1127h;

    /* renamed from: i */
    private ArrayList<C0371i> f1128i;

    /* renamed from: j */
    private ArrayList<C0371i> f1129j;

    /* renamed from: k */
    private boolean f1130k;

    /* renamed from: l */
    private int f1131l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1132m;

    /* renamed from: n */
    CharSequence f1133n;

    /* renamed from: o */
    Drawable f1134o;

    /* renamed from: p */
    View f1135p;

    /* renamed from: q */
    private boolean f1136q = false;

    /* renamed from: r */
    private boolean f1137r = false;

    /* renamed from: s */
    private boolean f1138s = false;

    /* renamed from: t */
    private boolean f1139t = false;

    /* renamed from: u */
    private boolean f1140u = false;

    /* renamed from: v */
    private ArrayList<C0371i> f1141v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0383m>> f1142w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0371i f1143x;

    /* renamed from: y */
    private boolean f1144y = false;

    /* renamed from: z */
    private boolean f1145z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuBuilder */
    public interface C0368a {
        /* renamed from: a */
        boolean mo967a(C0367g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo968b(C0367g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* compiled from: MenuBuilder */
    public interface C0369b {
        /* renamed from: a */
        boolean mo1197a(C0371i iVar);
    }

    public C0367g(Context context) {
        this.f1120a = context;
        this.f1121b = context.getResources();
        this.f1125f = new ArrayList<>();
        this.f1126g = new ArrayList<>();
        this.f1127h = true;
        this.f1128i = new ArrayList<>();
        this.f1129j = new ArrayList<>();
        this.f1130k = true;
        m1798b0(true);
    }

    /* renamed from: B */
    private static int m1795B(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1119A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m1796N(int i, boolean z) {
        if (i >= 0 && i < this.f1125f.size()) {
            this.f1125f.remove(i);
            if (z) {
                mo1343K(true);
            }
        }
    }

    /* renamed from: W */
    private void m1797W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources C = mo1335C();
        if (view != null) {
            this.f1135p = view;
            this.f1133n = null;
            this.f1134o = null;
        } else {
            if (i > 0) {
                this.f1133n = C.getText(i);
            } else if (charSequence != null) {
                this.f1133n = charSequence;
            }
            if (i2 > 0) {
                this.f1134o = C0681a.m3150f(mo1402u(), i2);
            } else if (drawable != null) {
                this.f1134o = drawable;
            }
            this.f1135p = null;
        }
        mo1343K(false);
    }

    /* renamed from: b0 */
    private void m1798b0(boolean z) {
        boolean z2 = true;
        if (!z || this.f1121b.getConfiguration().keyboard == 1 || !C0894c0.m4063e(ViewConfiguration.get(this.f1120a), this.f1120a)) {
            z2 = false;
        }
        this.f1123d = z2;
    }

    /* renamed from: g */
    private C0371i m1799g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0371i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m1800i(boolean z) {
        if (!this.f1142w.isEmpty()) {
            mo1375d0();
            Iterator<WeakReference<C0383m>> it = this.f1142w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0383m mVar = (C0383m) next.get();
                if (mVar == null) {
                    this.f1142w.remove(next);
                } else {
                    mVar.mo1273c(z);
                }
            }
            mo1370c0();
        }
    }

    /* renamed from: j */
    private boolean m1801j(C0392r rVar, C0383m mVar) {
        boolean z = false;
        if (this.f1142w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo1279j(rVar);
        }
        Iterator<WeakReference<C0383m>> it = this.f1142w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0383m mVar2 = (C0383m) next.get();
            if (mVar2 == null) {
                this.f1142w.remove(next);
            } else if (!z) {
                z = mVar2.mo1279j(rVar);
            }
        }
        return z;
    }

    /* renamed from: n */
    private static int m1802n(ArrayList<C0371i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1416f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo1334A() {
        return this.f1139t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public Resources mo1335C() {
        return this.f1121b;
    }

    /* renamed from: D */
    public C0367g mo1336D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0371i> mo1337E() {
        if (!this.f1127h) {
            return this.f1126g;
        }
        this.f1126g.clear();
        int size = this.f1125f.size();
        for (int i = 0; i < size; i++) {
            C0371i iVar = this.f1125f.get(i);
            if (iVar.isVisible()) {
                this.f1126g.add(iVar);
            }
        }
        this.f1127h = false;
        this.f1130k = true;
        return this.f1126g;
    }

    /* renamed from: F */
    public boolean mo1338F() {
        return this.f1144y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo1339G() {
        return this.f1122c;
    }

    /* renamed from: H */
    public boolean mo1340H() {
        return this.f1123d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo1341I(C0371i iVar) {
        this.f1130k = true;
        mo1343K(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo1342J(C0371i iVar) {
        this.f1127h = true;
        mo1343K(true);
    }

    /* renamed from: K */
    public void mo1343K(boolean z) {
        if (!this.f1136q) {
            if (z) {
                this.f1127h = true;
                this.f1130k = true;
            }
            m1800i(z);
            return;
        }
        this.f1137r = true;
        if (z) {
            this.f1138s = true;
        }
    }

    /* renamed from: L */
    public boolean mo1344L(MenuItem menuItem, int i) {
        return mo1345M(menuItem, (C0383m) null, i);
    }

    /* renamed from: M */
    public boolean mo1345M(MenuItem menuItem, C0383m mVar, int i) {
        C0371i iVar = (C0371i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k = iVar.mo1438k();
        C0882b b = iVar.mo1213b();
        boolean z = b != null && b.mo1527a();
        if (iVar.mo1437j()) {
            k |= iVar.expandActionView();
            if (k) {
                mo1376e(true);
            }
        } else if (iVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo1376e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.mo1468x(new C0392r(mo1402u(), this, iVar));
            }
            C0392r rVar = (C0392r) iVar.getSubMenu();
            if (z) {
                b.mo1530f(rVar);
            }
            k |= m1801j(rVar, mVar);
            if (!k) {
                mo1376e(true);
            }
        } else if ((i & 1) == 0) {
            mo1376e(true);
        }
        return k;
    }

    /* renamed from: O */
    public void mo1346O(C0383m mVar) {
        Iterator<WeakReference<C0383m>> it = this.f1142w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0383m mVar2 = (C0383m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f1142w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void mo1347P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1401t());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0392r) item.getSubMenu()).mo1347P(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: Q */
    public void mo1348Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0392r) item.getSubMenu()).mo1348Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1401t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo1349R(C0368a aVar) {
        this.f1124e = aVar;
    }

    /* renamed from: S */
    public C0367g mo1350S(int i) {
        this.f1131l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo1351T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1125f.size();
        mo1375d0();
        for (int i = 0; i < size; i++) {
            C0371i iVar = this.f1125f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo1440m() && iVar.isCheckable()) {
                iVar.mo1446s(iVar == menuItem);
            }
        }
        mo1370c0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public C0367g mo1352U(int i) {
        m1797W(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public C0367g mo1353V(Drawable drawable) {
        m1797W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public C0367g mo1354X(int i) {
        m1797W(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0367g mo1355Y(CharSequence charSequence) {
        m1797W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0367g mo1356Z(View view) {
        m1797W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1357a(int i, int i2, int i3, CharSequence charSequence) {
        int B = m1795B(i3);
        C0371i g = m1799g(i, i2, i3, B, charSequence, this.f1131l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1132m;
        if (contextMenuInfo != null) {
            g.mo1466v(contextMenuInfo);
        }
        ArrayList<C0371i> arrayList = this.f1125f;
        arrayList.add(m1802n(arrayList, B), g);
        mo1343K(true);
        return g;
    }

    /* renamed from: a0 */
    public void mo1358a0(boolean z) {
        this.f1145z = z;
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1357a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1120a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1368b(C0383m mVar) {
        mo1369c(mVar, this.f1120a);
    }

    /* renamed from: c */
    public void mo1369c(C0383m mVar, Context context) {
        this.f1142w.add(new WeakReference(mVar));
        mVar.mo1277h(context, this);
        this.f1130k = true;
    }

    /* renamed from: c0 */
    public void mo1370c0() {
        this.f1136q = false;
        if (this.f1137r) {
            this.f1137r = false;
            mo1343K(this.f1138s);
        }
    }

    public void clear() {
        C0371i iVar = this.f1143x;
        if (iVar != null) {
            mo1377f(iVar);
        }
        this.f1125f.clear();
        mo1343K(true);
    }

    public void clearHeader() {
        this.f1134o = null;
        this.f1133n = null;
        this.f1135p = null;
        mo1343K(false);
    }

    public void close() {
        mo1376e(true);
    }

    /* renamed from: d */
    public void mo1374d() {
        C0368a aVar = this.f1124e;
        if (aVar != null) {
            aVar.mo968b(this);
        }
    }

    /* renamed from: d0 */
    public void mo1375d0() {
        if (!this.f1136q) {
            this.f1136q = true;
            this.f1137r = false;
            this.f1138s = false;
        }
    }

    /* renamed from: e */
    public final void mo1376e(boolean z) {
        if (!this.f1140u) {
            this.f1140u = true;
            Iterator<WeakReference<C0383m>> it = this.f1142w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0383m mVar = (C0383m) next.get();
                if (mVar == null) {
                    this.f1142w.remove(next);
                } else {
                    mVar.mo1271a(this, z);
                }
            }
            this.f1140u = false;
        }
    }

    /* renamed from: f */
    public boolean mo1377f(C0371i iVar) {
        boolean z = false;
        if (!this.f1142w.isEmpty() && this.f1143x == iVar) {
            mo1375d0();
            Iterator<WeakReference<C0383m>> it = this.f1142w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0383m mVar = (C0383m) next.get();
                if (mVar == null) {
                    this.f1142w.remove(next);
                } else {
                    z = mVar.mo1274e(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1370c0();
            if (z) {
                this.f1143x = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0371i iVar = this.f1125f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f1125f.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1380h(C0367g gVar, MenuItem menuItem) {
        C0368a aVar = this.f1124e;
        return aVar != null && aVar.mo967a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f1145z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1125f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1387p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo1383k(C0371i iVar) {
        boolean z = false;
        if (this.f1142w.isEmpty()) {
            return false;
        }
        mo1375d0();
        Iterator<WeakReference<C0383m>> it = this.f1142w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0383m mVar = (C0383m) next.get();
            if (mVar == null) {
                this.f1142w.remove(next);
            } else {
                z = mVar.mo1275f(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo1370c0();
        if (z) {
            this.f1143x = iVar;
        }
        return z;
    }

    /* renamed from: l */
    public int mo1384l(int i) {
        return mo1385m(i, 0);
    }

    /* renamed from: m */
    public int mo1385m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1125f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int mo1386o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1125f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0371i mo1387p(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0371i> arrayList = this.f1141v;
        arrayList.clear();
        mo1390q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = mo1339G();
        for (int i2 = 0; i2 < size; i2++) {
            C0371i iVar = arrayList.get(i2);
            if (G) {
                c = iVar.getAlphabeticShortcut();
            } else {
                c = iVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (G && c == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1344L(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0371i p = mo1387p(i, keyEvent);
        boolean L = p != null ? mo1344L(p, i2) : false;
        if ((i2 & 2) != 0) {
            mo1376e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1390q(List<C0371i> list, int i, KeyEvent keyEvent) {
        boolean G = mo1339G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1125f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0371i iVar = this.f1125f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0367g) iVar.getSubMenu()).mo1390q(list, i, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo1391r() {
        ArrayList<C0371i> E = mo1337E();
        if (this.f1130k) {
            Iterator<WeakReference<C0383m>> it = this.f1142w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0383m mVar = (C0383m) next.get();
                if (mVar == null) {
                    this.f1142w.remove(next);
                } else {
                    z |= mVar.mo1293d();
                }
            }
            if (z) {
                this.f1128i.clear();
                this.f1129j.clear();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    C0371i iVar = E.get(i);
                    if (iVar.mo1439l()) {
                        this.f1128i.add(iVar);
                    } else {
                        this.f1129j.add(iVar);
                    }
                }
            } else {
                this.f1128i.clear();
                this.f1129j.clear();
                this.f1129j.addAll(mo1337E());
            }
            this.f1130k = false;
        }
    }

    public void removeGroup(int i) {
        int l = mo1384l(i);
        if (l >= 0) {
            int size = this.f1125f.size() - l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1125f.get(l).getGroupId() != i) {
                    mo1343K(true);
                } else {
                    m1796N(l, false);
                    i2 = i3;
                }
            }
            mo1343K(true);
        }
    }

    public void removeItem(int i) {
        m1796N(mo1386o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C0371i> mo1394s() {
        mo1391r();
        return this.f1128i;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1125f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0371i iVar = this.f1125f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo1463t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1144y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1125f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0371i iVar = this.f1125f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1125f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0371i iVar = this.f1125f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo1469y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1343K(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1122c = z;
        mo1343K(false);
    }

    public int size() {
        return this.f1125f.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo1401t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context mo1402u() {
        return this.f1120a;
    }

    /* renamed from: v */
    public C0371i mo1403v() {
        return this.f1143x;
    }

    /* renamed from: w */
    public Drawable mo1404w() {
        return this.f1134o;
    }

    /* renamed from: x */
    public CharSequence mo1405x() {
        return this.f1133n;
    }

    /* renamed from: y */
    public View mo1406y() {
        return this.f1135p;
    }

    /* renamed from: z */
    public ArrayList<C0371i> mo1407z() {
        mo1391r();
        return this.f1129j;
    }

    public MenuItem add(int i) {
        return mo1357a(0, 0, 0, this.f1121b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1121b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1357a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0371i iVar = (C0371i) mo1357a(i, i2, i3, charSequence);
        C0392r rVar = new C0392r(this.f1120a, this, iVar);
        iVar.mo1468x(rVar);
        return rVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1357a(i, i2, i3, this.f1121b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1121b.getString(i4));
    }
}
