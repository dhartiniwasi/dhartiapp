package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C1014e;
import androidx.emoji2.text.C1039m;
import java.util.Arrays;

/* renamed from: androidx.emoji2.text.h */
/* compiled from: EmojiProcessor */
final class C1027h {

    /* renamed from: a */
    private final C1014e.C1024i f2756a;

    /* renamed from: b */
    private final C1039m f2757b;

    /* renamed from: c */
    private C1014e.C1019d f2758c;

    /* renamed from: d */
    private final boolean f2759d;

    /* renamed from: e */
    private final int[] f2760e;

    /* renamed from: androidx.emoji2.text.h$a */
    /* compiled from: EmojiProcessor */
    private static final class C1028a {
        /* renamed from: a */
        static int m4601a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        static int m4602b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.h$b */
    /* compiled from: EmojiProcessor */
    static final class C1029b {

        /* renamed from: a */
        private int f2761a = 1;

        /* renamed from: b */
        private final C1039m.C1040a f2762b;

        /* renamed from: c */
        private C1039m.C1040a f2763c;

        /* renamed from: d */
        private C1039m.C1040a f2764d;

        /* renamed from: e */
        private int f2765e;

        /* renamed from: f */
        private int f2766f;

        /* renamed from: g */
        private final boolean f2767g;

        /* renamed from: h */
        private final int[] f2768h;

        C1029b(C1039m.C1040a aVar, boolean z, int[] iArr) {
            this.f2762b = aVar;
            this.f2763c = aVar;
            this.f2767g = z;
            this.f2768h = iArr;
        }

        /* renamed from: d */
        private static boolean m4603d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        private static boolean m4604f(int i) {
            return i == 65038;
        }

        /* renamed from: g */
        private int m4605g() {
            this.f2761a = 1;
            this.f2763c = this.f2762b;
            this.f2766f = 0;
            return 1;
        }

        /* renamed from: h */
        private boolean m4606h() {
            if (this.f2763c.mo3691b().mo3659j() || m4603d(this.f2765e)) {
                return true;
            }
            if (this.f2767g) {
                if (this.f2768h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2768h, this.f2763c.mo3691b().mo3652b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3663a(int i) {
            C1039m.C1040a a = this.f2763c.mo3690a(i);
            int i2 = 3;
            if (this.f2761a != 2) {
                if (a == null) {
                    i2 = m4605g();
                    this.f2765e = i;
                    return i2;
                }
                this.f2761a = 2;
                this.f2763c = a;
                this.f2766f = 1;
            } else if (a != null) {
                this.f2763c = a;
                this.f2766f++;
            } else {
                if (m4604f(i)) {
                    i2 = m4605g();
                } else if (!m4603d(i)) {
                    if (this.f2763c.mo3691b() == null) {
                        i2 = m4605g();
                    } else if (this.f2766f != 1) {
                        this.f2764d = this.f2763c;
                        m4605g();
                    } else if (m4606h()) {
                        this.f2764d = this.f2763c;
                        m4605g();
                    } else {
                        i2 = m4605g();
                    }
                }
                this.f2765e = i;
                return i2;
            }
            i2 = 2;
            this.f2765e = i;
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1026g mo3664b() {
            return this.f2763c.mo3691b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1026g mo3665c() {
            return this.f2764d.mo3691b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo3666e() {
            if (this.f2761a != 2 || this.f2763c.mo3691b() == null || (this.f2766f <= 1 && !m4606h())) {
                return false;
            }
            return true;
        }
    }

    C1027h(C1039m mVar, C1014e.C1024i iVar, C1014e.C1019d dVar, boolean z, int[] iArr) {
        this.f2756a = iVar;
        this.f2757b = mVar;
        this.f2758c = dVar;
        this.f2759d = z;
        this.f2760e = iArr;
    }

    /* renamed from: a */
    private void m4593a(Spannable spannable, C1026g gVar, int i, int i2) {
        spannable.setSpan(this.f2756a.mo3649a(gVar), i, i2, 33);
    }

    /* renamed from: b */
    private static boolean m4594b(Editable editable, KeyEvent keyEvent, boolean z) {
        C1030i[] iVarArr;
        if (m4599g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m4598f(selectionStart, selectionEnd) && (iVarArr = (C1030i[]) editable.getSpans(selectionStart, selectionEnd, C1030i.class)) != null && iVarArr.length > 0) {
            int length = iVarArr.length;
            int i = 0;
            while (i < length) {
                C1030i iVar = iVarArr[i];
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m4595c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m4598f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C1028a.m4601a(editable, selectionStart, Math.max(i, 0));
                i3 = C1028a.m4602b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            C1030i[] iVarArr = (C1030i[]) editable.getSpans(i4, i3, C1030i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (C1030i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    static boolean m4596d(Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        if (i != 67) {
            z = i != 112 ? false : m4594b(editable, keyEvent, true);
        } else {
            z = m4594b(editable, keyEvent, false);
        }
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: e */
    private boolean m4597e(CharSequence charSequence, int i, int i2, C1026g gVar) {
        if (gVar.mo3654d() == 0) {
            gVar.mo3660k(this.f2758c.mo3626a(charSequence, i, i2, gVar.mo3657h()));
        }
        return gVar.mo3654d() == 2;
    }

    /* renamed from: f */
    private static boolean m4598f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: g */
    private static boolean m4599g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo3662h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji2.text.C1041n
            if (r0 == 0) goto L_0x000a
            r1 = r10
            androidx.emoji2.text.n r1 = (androidx.emoji2.text.C1041n) r1
            r1.mo3693a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0033
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x012c }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji2.text.i> r5 = androidx.emoji2.text.C1030i.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x012c }
            if (r2 > r12) goto L_0x0033
            androidx.emoji2.text.p r1 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r1.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            goto L_0x0033
        L_0x002b:
            androidx.emoji2.text.p r1 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r2 = r10
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch:{ all -> 0x012c }
            r1.<init>((android.text.Spannable) r2)     // Catch:{ all -> 0x012c }
        L_0x0033:
            r2 = 0
            if (r1 == 0) goto L_0x0061
            java.lang.Class<androidx.emoji2.text.i> r3 = androidx.emoji2.text.C1030i.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.i[] r3 = (androidx.emoji2.text.C1030i[]) r3     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            if (r4 <= 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            r5 = 0
        L_0x0045:
            if (r5 >= r4) goto L_0x0061
            r6 = r3[r5]     // Catch:{ all -> 0x012c }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x012c }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x012c }
            if (r7 == r12) goto L_0x0056
            r1.removeSpan(r6)     // Catch:{ all -> 0x012c }
        L_0x0056:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x012c }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x012c }
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            if (r11 == r12) goto L_0x0123
            int r3 = r10.length()     // Catch:{ all -> 0x012c }
            if (r11 < r3) goto L_0x006b
            goto L_0x0123
        L_0x006b:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            int r3 = r1.length()     // Catch:{ all -> 0x012c }
            java.lang.Class<androidx.emoji2.text.i> r4 = androidx.emoji2.text.C1030i.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.i[] r3 = (androidx.emoji2.text.C1030i[]) r3     // Catch:{ all -> 0x012c }
            int r3 = r3.length     // Catch:{ all -> 0x012c }
            int r13 = r13 - r3
        L_0x0080:
            androidx.emoji2.text.h$b r3 = new androidx.emoji2.text.h$b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.m r4 = r9.f2757b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.m$a r4 = r4.mo3687f()     // Catch:{ all -> 0x012c }
            boolean r5 = r9.f2759d     // Catch:{ all -> 0x012c }
            int[] r6 = r9.f2760e     // Catch:{ all -> 0x012c }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x012c }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            r2 = r1
            r5 = r4
            r4 = 0
        L_0x0096:
            r1 = r11
        L_0x0097:
            if (r11 >= r12) goto L_0x00e9
            if (r4 >= r13) goto L_0x00e9
            int r6 = r3.mo3663a(r5)     // Catch:{ all -> 0x012c }
            r7 = 1
            if (r6 == r7) goto L_0x00d7
            r7 = 2
            if (r6 == r7) goto L_0x00cb
            r7 = 3
            if (r6 == r7) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            if (r14 != 0) goto L_0x00b5
            androidx.emoji2.text.g r6 = r3.mo3665c()     // Catch:{ all -> 0x012c }
            boolean r6 = r9.m4597e(r10, r1, r11, r6)     // Catch:{ all -> 0x012c }
            if (r6 != 0) goto L_0x0096
        L_0x00b5:
            if (r2 != 0) goto L_0x00c1
            androidx.emoji2.text.p r2 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x012c }
            r6.<init>(r10)     // Catch:{ all -> 0x012c }
            r2.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x012c }
        L_0x00c1:
            androidx.emoji2.text.g r6 = r3.mo3665c()     // Catch:{ all -> 0x012c }
            r9.m4593a(r2, r6, r1, r11)     // Catch:{ all -> 0x012c }
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00cb:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x012c }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0097
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            goto L_0x0097
        L_0x00d7:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x012c }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00e7
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            r5 = r11
        L_0x00e7:
            r11 = r1
            goto L_0x0097
        L_0x00e9:
            boolean r12 = r3.mo3666e()     // Catch:{ all -> 0x012c }
            if (r12 == 0) goto L_0x010c
            if (r4 >= r13) goto L_0x010c
            if (r14 != 0) goto L_0x00fd
            androidx.emoji2.text.g r12 = r3.mo3664b()     // Catch:{ all -> 0x012c }
            boolean r12 = r9.m4597e(r10, r1, r11, r12)     // Catch:{ all -> 0x012c }
            if (r12 != 0) goto L_0x010c
        L_0x00fd:
            if (r2 != 0) goto L_0x0105
            androidx.emoji2.text.p r12 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r12.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            r2 = r12
        L_0x0105:
            androidx.emoji2.text.g r12 = r3.mo3664b()     // Catch:{ all -> 0x012c }
            r9.m4593a(r2, r12, r1, r11)     // Catch:{ all -> 0x012c }
        L_0x010c:
            if (r2 == 0) goto L_0x011a
            android.text.Spannable r11 = r2.mo3721b()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0119
            androidx.emoji2.text.n r10 = (androidx.emoji2.text.C1041n) r10
            r10.mo3698d()
        L_0x0119:
            return r11
        L_0x011a:
            if (r0 == 0) goto L_0x0122
            r11 = r10
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.C1041n) r11
            r11.mo3698d()
        L_0x0122:
            return r10
        L_0x0123:
            if (r0 == 0) goto L_0x012b
            r11 = r10
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.C1041n) r11
            r11.mo3698d()
        L_0x012b:
            return r10
        L_0x012c:
            r11 = move-exception
            if (r0 == 0) goto L_0x0134
            androidx.emoji2.text.n r10 = (androidx.emoji2.text.C1041n) r10
            r10.mo3698d()
        L_0x0134:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1027h.mo3662h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
