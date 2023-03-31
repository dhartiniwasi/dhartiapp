package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0519m0;
import androidx.core.view.C0835a0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p048g.C4288a;
import p048g.C4293f;
import p048g.C4297j;

class AlertController {

    /* renamed from: A */
    NestedScrollView f616A;

    /* renamed from: B */
    private int f617B = 0;

    /* renamed from: C */
    private Drawable f618C;

    /* renamed from: D */
    private ImageView f619D;

    /* renamed from: E */
    private TextView f620E;

    /* renamed from: F */
    private TextView f621F;

    /* renamed from: G */
    private View f622G;

    /* renamed from: H */
    ListAdapter f623H;

    /* renamed from: I */
    int f624I = -1;

    /* renamed from: J */
    private int f625J;

    /* renamed from: K */
    private int f626K;

    /* renamed from: L */
    int f627L;

    /* renamed from: M */
    int f628M;

    /* renamed from: N */
    int f629N;

    /* renamed from: O */
    int f630O;

    /* renamed from: P */
    private boolean f631P;

    /* renamed from: Q */
    private int f632Q = 0;

    /* renamed from: R */
    Handler f633R;

    /* renamed from: S */
    private final View.OnClickListener f634S = new C0262a();

    /* renamed from: a */
    private final Context f635a;

    /* renamed from: b */
    final C0315i f636b;

    /* renamed from: c */
    private final Window f637c;

    /* renamed from: d */
    private final int f638d;

    /* renamed from: e */
    private CharSequence f639e;

    /* renamed from: f */
    private CharSequence f640f;

    /* renamed from: g */
    ListView f641g;

    /* renamed from: h */
    private View f642h;

    /* renamed from: i */
    private int f643i;

    /* renamed from: j */
    private int f644j;

    /* renamed from: k */
    private int f645k;

    /* renamed from: l */
    private int f646l;

    /* renamed from: m */
    private int f647m;

    /* renamed from: n */
    private boolean f648n = false;

    /* renamed from: o */
    Button f649o;

    /* renamed from: p */
    private CharSequence f650p;

    /* renamed from: q */
    Message f651q;

    /* renamed from: r */
    private Drawable f652r;

    /* renamed from: s */
    Button f653s;

    /* renamed from: t */
    private CharSequence f654t;

    /* renamed from: u */
    Message f655u;

    /* renamed from: v */
    private Drawable f656v;

    /* renamed from: w */
    Button f657w;

    /* renamed from: x */
    private CharSequence f658x;

    /* renamed from: y */
    Message f659y;

    /* renamed from: z */
    private Drawable f660z;

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f661a;

        /* renamed from: b */
        private final int f662b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4297j.f24058c2);
            this.f662b = obtainStyledAttributes.getDimensionPixelOffset(C4297j.f24063d2, -1);
            this.f661a = obtainStyledAttributes.getDimensionPixelOffset(C4297j.f24068e2, -1);
        }

        /* renamed from: a */
        public void mo824a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f661a, getPaddingRight(), z2 ? getPaddingBottom() : this.f662b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0262a implements View.OnClickListener {
        C0262a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f659y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f649o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f651q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f653s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f655u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f657w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f659y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f633R
                r1 = 1
                androidx.appcompat.app.i r3 = r3.f636b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0262a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0263b implements NestedScrollView.C0961c {

        /* renamed from: a */
        final /* synthetic */ View f664a;

        /* renamed from: b */
        final /* synthetic */ View f665b;

        C0263b(View view, View view2) {
            this.f664a = view;
            this.f665b = view2;
        }

        /* renamed from: a */
        public void mo826a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m1268f(nestedScrollView, this.f664a, this.f665b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0264c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f667a;

        /* renamed from: b */
        final /* synthetic */ View f668b;

        C0264c(View view, View view2) {
            this.f667a = view;
            this.f668b = view2;
        }

        public void run() {
            AlertController.m1268f(AlertController.this.f616A, this.f667a, this.f668b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0265d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f670a;

        /* renamed from: b */
        final /* synthetic */ View f671b;

        C0265d(View view, View view2) {
            this.f670a = view;
            this.f671b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m1268f(absListView, this.f670a, this.f671b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0266e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f673a;

        /* renamed from: b */
        final /* synthetic */ View f674b;

        C0266e(View view, View view2) {
            this.f673a = view;
            this.f674b = view2;
        }

        public void run() {
            AlertController.m1268f(AlertController.this.f641g, this.f673a, this.f674b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0267f {

        /* renamed from: A */
        public int f676A;

        /* renamed from: B */
        public int f677B;

        /* renamed from: C */
        public int f678C;

        /* renamed from: D */
        public int f679D;

        /* renamed from: E */
        public boolean f680E = false;

        /* renamed from: F */
        public boolean[] f681F;

        /* renamed from: G */
        public boolean f682G;

        /* renamed from: H */
        public boolean f683H;

        /* renamed from: I */
        public int f684I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f685J;

        /* renamed from: K */
        public Cursor f686K;

        /* renamed from: L */
        public String f687L;

        /* renamed from: M */
        public String f688M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f689N;

        /* renamed from: O */
        public C0272e f690O;

        /* renamed from: P */
        public boolean f691P = true;

        /* renamed from: a */
        public final Context f692a;

        /* renamed from: b */
        public final LayoutInflater f693b;

        /* renamed from: c */
        public int f694c = 0;

        /* renamed from: d */
        public Drawable f695d;

        /* renamed from: e */
        public int f696e = 0;

        /* renamed from: f */
        public CharSequence f697f;

        /* renamed from: g */
        public View f698g;

        /* renamed from: h */
        public CharSequence f699h;

        /* renamed from: i */
        public CharSequence f700i;

        /* renamed from: j */
        public Drawable f701j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f702k;

        /* renamed from: l */
        public CharSequence f703l;

        /* renamed from: m */
        public Drawable f704m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f705n;

        /* renamed from: o */
        public CharSequence f706o;

        /* renamed from: p */
        public Drawable f707p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f708q;

        /* renamed from: r */
        public boolean f709r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f710s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f711t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f712u;

        /* renamed from: v */
        public CharSequence[] f713v;

        /* renamed from: w */
        public ListAdapter f714w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f715x;

        /* renamed from: y */
        public int f716y;

        /* renamed from: z */
        public View f717z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0268a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f718a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0268a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f718a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0267f.this.f681F;
                if (zArr != null && zArr[i]) {
                    this.f718a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0269b extends CursorAdapter {

            /* renamed from: a */
            private final int f720a;

            /* renamed from: b */
            private final int f721b;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f722c;

            /* renamed from: d */
            final /* synthetic */ AlertController f723d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0269b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f722c = recycleListView;
                this.f723d = alertController;
                Cursor cursor2 = getCursor();
                this.f720a = cursor2.getColumnIndexOrThrow(C0267f.this.f687L);
                this.f721b = cursor2.getColumnIndexOrThrow(C0267f.this.f688M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f720a));
                RecycleListView recycleListView = this.f722c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f721b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0267f.this.f693b.inflate(this.f723d.f628M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0270c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertController f725a;

            C0270c(AlertController alertController) {
                this.f725a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0267f.this.f715x.onClick(this.f725a.f636b, i);
                if (!C0267f.this.f683H) {
                    this.f725a.f636b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0271d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f727a;

            /* renamed from: b */
            final /* synthetic */ AlertController f728b;

            C0271d(RecycleListView recycleListView, AlertController alertController) {
                this.f727a = recycleListView;
                this.f728b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0267f.this.f681F;
                if (zArr != null) {
                    zArr[i] = this.f727a.isItemChecked(i);
                }
                C0267f.this.f685J.onClick(this.f728b.f636b, i, this.f727a.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0272e {
            /* renamed from: a */
            void mo837a(ListView listView);
        }

        public C0267f(Context context) {
            this.f692a = context;
            this.f709r = true;
            this.f693b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1294b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f693b
                int r1 = r11.f627L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f682G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f686K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f692a
                int r4 = r11.f628M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f713v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f692a
                android.database.Cursor r4 = r10.f686K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f683H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f629N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f630O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f686K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f692a
                android.database.Cursor r5 = r10.f686K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f687L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f714w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f692a
                java.lang.CharSequence[] r3 = r10.f713v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f690O
                if (r1 == 0) goto L_0x0072
                r1.mo837a(r0)
            L_0x0072:
                r11.f623H = r9
                int r1 = r10.f684I
                r11.f624I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f715x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f685J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f689N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.f683H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.f682G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f641g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0267f.m1294b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo831a(AlertController alertController) {
            View view = this.f698g;
            if (view != null) {
                alertController.mo816l(view);
            } else {
                CharSequence charSequence = this.f697f;
                if (charSequence != null) {
                    alertController.mo820q(charSequence);
                }
                Drawable drawable = this.f695d;
                if (drawable != null) {
                    alertController.mo818n(drawable);
                }
                int i = this.f694c;
                if (i != 0) {
                    alertController.mo817m(i);
                }
                int i2 = this.f696e;
                if (i2 != 0) {
                    alertController.mo817m(alertController.mo810c(i2));
                }
            }
            CharSequence charSequence2 = this.f699h;
            if (charSequence2 != null) {
                alertController.mo819o(charSequence2);
            }
            CharSequence charSequence3 = this.f700i;
            if (!(charSequence3 == null && this.f701j == null)) {
                alertController.mo815k(-1, charSequence3, this.f702k, (Message) null, this.f701j);
            }
            CharSequence charSequence4 = this.f703l;
            if (!(charSequence4 == null && this.f704m == null)) {
                alertController.mo815k(-2, charSequence4, this.f705n, (Message) null, this.f704m);
            }
            CharSequence charSequence5 = this.f706o;
            if (!(charSequence5 == null && this.f707p == null)) {
                alertController.mo815k(-3, charSequence5, this.f708q, (Message) null, this.f707p);
            }
            if (!(this.f713v == null && this.f686K == null && this.f714w == null)) {
                m1294b(alertController);
            }
            View view2 = this.f717z;
            if (view2 == null) {
                int i3 = this.f716y;
                if (i3 != 0) {
                    alertController.mo821r(i3);
                }
            } else if (this.f680E) {
                alertController.mo823t(view2, this.f676A, this.f677B, this.f678C, this.f679D);
            } else {
                alertController.mo822s(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0273g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f730a;

        public C0273g(DialogInterface dialogInterface) {
            this.f730a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f730a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0274h extends ArrayAdapter<CharSequence> {
        public C0274h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0315i iVar, Window window) {
        this.f635a = context;
        this.f636b = iVar;
        this.f637c = window;
        this.f633R = new C0273g(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C4297j.f23960F, C4288a.f23774n, 0);
        this.f625J = obtainStyledAttributes.getResourceId(C4297j.f23965G, 0);
        this.f626K = obtainStyledAttributes.getResourceId(C4297j.f23973I, 0);
        this.f627L = obtainStyledAttributes.getResourceId(C4297j.f23981K, 0);
        this.f628M = obtainStyledAttributes.getResourceId(C4297j.f23985L, 0);
        this.f629N = obtainStyledAttributes.getResourceId(C4297j.f23993N, 0);
        this.f630O = obtainStyledAttributes.getResourceId(C4297j.f23977J, 0);
        this.f631P = obtainStyledAttributes.getBoolean(C4297j.f23989M, true);
        this.f638d = obtainStyledAttributes.getDimensionPixelSize(C4297j.f23969H, 0);
        obtainStyledAttributes.recycle();
        iVar.mo1038g(1);
    }

    /* renamed from: a */
    static boolean m1266a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1266a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1267b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m1268f(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: i */
    private ViewGroup m1269i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m1270j() {
        int i = this.f626K;
        if (i == 0) {
            return this.f625J;
        }
        if (this.f632Q == 1) {
            return i;
        }
        return this.f625J;
    }

    /* renamed from: p */
    private void m1271p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f637c.findViewById(C4293f.f23893v);
        View findViewById2 = this.f637c.findViewById(C4293f.f23892u);
        if (Build.VERSION.SDK_INT >= 23) {
            C0835a0.m3685C0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f640f != null) {
                this.f616A.setOnScrollChangeListener(new C0263b(findViewById, findViewById2));
                this.f616A.post(new C0264c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f641g;
            if (listView != null) {
                listView.setOnScrollListener(new C0265d(findViewById, findViewById2));
                this.f641g.post(new C0266e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: u */
    private void m1272u(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f649o = button;
        button.setOnClickListener(this.f634S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f650p) || this.f652r != null) {
            this.f649o.setText(this.f650p);
            Drawable drawable = this.f652r;
            if (drawable != null) {
                int i = this.f638d;
                drawable.setBounds(0, 0, i, i);
                this.f649o.setCompoundDrawables(this.f652r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f649o.setVisibility(0);
            z = true;
        } else {
            this.f649o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f653s = button2;
        button2.setOnClickListener(this.f634S);
        if (!TextUtils.isEmpty(this.f654t) || this.f656v != null) {
            this.f653s.setText(this.f654t);
            Drawable drawable2 = this.f656v;
            if (drawable2 != null) {
                int i2 = this.f638d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f653s.setCompoundDrawables(this.f656v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f653s.setVisibility(0);
            z |= true;
        } else {
            this.f653s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f657w = button3;
        button3.setOnClickListener(this.f634S);
        if (!TextUtils.isEmpty(this.f658x) || this.f660z != null) {
            this.f657w.setText(this.f658x);
            Drawable drawable3 = this.f660z;
            if (drawable3 != null) {
                int i3 = this.f638d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f657w.setCompoundDrawables(this.f660z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f657w.setVisibility(0);
            z |= true;
        } else {
            this.f657w.setVisibility(8);
        }
        if (m1277z(this.f635a)) {
            if (z) {
                m1267b(this.f649o);
            } else if (z) {
                m1267b(this.f653s);
            } else if (z) {
                m1267b(this.f657w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m1273v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f637c.findViewById(C4293f.f23894w);
        this.f616A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f616A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f621F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f640f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f616A.removeView(this.f621F);
            if (this.f641g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f616A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f616A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f641g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m1274w(ViewGroup viewGroup) {
        View view = this.f642h;
        boolean z = false;
        if (view == null) {
            view = this.f643i != 0 ? LayoutInflater.from(this.f635a).inflate(this.f643i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m1266a(view)) {
            this.f637c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f637c.findViewById(C4293f.f23885n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f648n) {
                frameLayout.setPadding(this.f644j, this.f645k, this.f646l, this.f647m);
            }
            if (this.f641g != null) {
                ((C0519m0.C0520a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m1275x(ViewGroup viewGroup) {
        if (this.f622G != null) {
            viewGroup.addView(this.f622G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f637c.findViewById(C4293f.f23870O).setVisibility(8);
            return;
        }
        this.f619D = (ImageView) this.f637c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f639e)) || !this.f631P) {
            this.f637c.findViewById(C4293f.f23870O).setVisibility(8);
            this.f619D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f637c.findViewById(C4293f.f23881j);
        this.f620E = textView;
        textView.setText(this.f639e);
        int i = this.f617B;
        if (i != 0) {
            this.f619D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f618C;
        if (drawable != null) {
            this.f619D.setImageDrawable(drawable);
            return;
        }
        this.f620E.setPadding(this.f619D.getPaddingLeft(), this.f619D.getPaddingTop(), this.f619D.getPaddingRight(), this.f619D.getPaddingBottom());
        this.f619D.setVisibility(8);
    }

    /* renamed from: y */
    private void m1276y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f637c.findViewById(C4293f.f23891t);
        int i = C4293f.f23871P;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C4293f.f23884m;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C4293f.f23882k;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C4293f.f23886o);
        m1274w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup i4 = m1269i(findViewById7, findViewById4);
        ViewGroup i5 = m1269i(findViewById8, findViewById5);
        ViewGroup i6 = m1269i(findViewById9, findViewById6);
        m1273v(i5);
        m1272u(i6);
        m1275x(i4);
        char c = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (i4 == null || i4.getVisibility() == 8) ? false : true;
        boolean z3 = (i6 == null || i6.getVisibility() == 8) ? false : true;
        if (!(z3 || i5 == null || (findViewById2 = i5.findViewById(C4293f.f23866K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f616A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f640f == null && this.f641g == null)) {
                view = i4.findViewById(C4293f.f23869N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i5 == null || (findViewById = i5.findViewById(C4293f.f23867L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f641g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo824a(z2, z3);
        }
        if (!z) {
            View view2 = this.f641g;
            if (view2 == null) {
                view2 = this.f616A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m1271p(i5, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f641g;
        if (listView2 != null && (listAdapter = this.f623H) != null) {
            listView2.setAdapter(listAdapter);
            int i7 = this.f624I;
            if (i7 > -1) {
                listView2.setItemChecked(i7, true);
                listView2.setSelection(i7);
            }
        }
    }

    /* renamed from: z */
    private static boolean m1277z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4288a.f23773m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo810c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f635a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo811d() {
        return this.f641g;
    }

    /* renamed from: e */
    public void mo812e() {
        this.f636b.setContentView(m1270j());
        m1276y();
    }

    /* renamed from: g */
    public boolean mo813g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f616A;
        return nestedScrollView != null && nestedScrollView.mo3536m(keyEvent);
    }

    /* renamed from: h */
    public boolean mo814h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f616A;
        return nestedScrollView != null && nestedScrollView.mo3536m(keyEvent);
    }

    /* renamed from: k */
    public void mo815k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f633R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f658x = charSequence;
            this.f659y = message;
            this.f660z = drawable;
        } else if (i == -2) {
            this.f654t = charSequence;
            this.f655u = message;
            this.f656v = drawable;
        } else if (i == -1) {
            this.f650p = charSequence;
            this.f651q = message;
            this.f652r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void mo816l(View view) {
        this.f622G = view;
    }

    /* renamed from: m */
    public void mo817m(int i) {
        this.f618C = null;
        this.f617B = i;
        ImageView imageView = this.f619D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f619D.setImageResource(this.f617B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo818n(Drawable drawable) {
        this.f618C = drawable;
        this.f617B = 0;
        ImageView imageView = this.f619D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f619D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo819o(CharSequence charSequence) {
        this.f640f = charSequence;
        TextView textView = this.f621F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo820q(CharSequence charSequence) {
        this.f639e = charSequence;
        TextView textView = this.f620E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo821r(int i) {
        this.f642h = null;
        this.f643i = i;
        this.f648n = false;
    }

    /* renamed from: s */
    public void mo822s(View view) {
        this.f642h = view;
        this.f643i = 0;
        this.f648n = false;
    }

    /* renamed from: t */
    public void mo823t(View view, int i, int i2, int i3, int i4) {
        this.f642h = view;
        this.f643i = 0;
        this.f648n = true;
        this.f644j = i;
        this.f645k = i2;
        this.f646l = i3;
        this.f647m = i4;
    }
}
