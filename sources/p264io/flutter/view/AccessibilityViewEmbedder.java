package p264io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p297mb.C11881b;

@Keep
/* renamed from: io.flutter.view.AccessibilityViewEmbedder */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<C11066c> flutterIdToOrigin = new SparseArray<>();
    private int nextFlutterId;
    private final Map<C11066c, Integer> originToFlutterId;
    private final C11065b reflectionAccessors = new C11065b();
    private final View rootAccessibilityView;

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$b */
    private static class C11065b {

        /* renamed from: a */
        private final Method f42652a;

        /* renamed from: b */
        private final Method f42653b;

        /* renamed from: c */
        private final Method f42654c;

        /* renamed from: d */
        private final Method f42655d;

        /* renamed from: e */
        private final Field f42656e;

        /* renamed from: f */
        private final Method f42657f;

        /* access modifiers changed from: private */
        /* renamed from: f */
        public Long m54800f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            Method method = this.f42655d;
            if (method == null && (this.f42656e == null || this.f42657f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, new Object[]{Integer.valueOf(i)});
                } catch (IllegalAccessException e) {
                    C11881b.m57390h(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e);
                    return null;
                } catch (InvocationTargetException e2) {
                    C11881b.m57390h(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e2);
                    return null;
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f42657f.invoke(this.f42656e.get(accessibilityNodeInfo), new Object[]{Integer.valueOf(i)})).longValue());
                } catch (IllegalAccessException e3) {
                    C11881b.m57390h(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e3);
                    return null;
                } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e4) {
                    C11881b.m57390h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e4);
                    return null;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public Long m54801g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f42653b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e) {
                    C11881b.m57390h(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e);
                } catch (InvocationTargetException e2) {
                    C11881b.m57390h(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e2);
                }
            }
            return m54806l(accessibilityNodeInfo);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public Long m54802h(AccessibilityRecord accessibilityRecord) {
            Method method = this.f42654c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e) {
                C11881b.m57390h(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e);
                return null;
            } catch (InvocationTargetException e2) {
                C11881b.m57390h(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e2);
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public Long m54803i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f42652a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e) {
                C11881b.m57390h(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e);
                return null;
            } catch (InvocationTargetException e2) {
                C11881b.m57390h(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e2);
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static int m54804j(long j) {
            return (int) (j >> 32);
        }

        /* renamed from: k */
        private static boolean m54805k(long j, int i) {
            return (j & (1 << i)) != 0;
        }

        /* renamed from: l */
        private static Long m54806l(AccessibilityNodeInfo accessibilityNodeInfo) {
            Long l = null;
            if (Build.VERSION.SDK_INT < 26) {
                C11881b.m57389g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (m54805k(readLong, 0)) {
                obtain2.readInt();
            }
            if (m54805k(readLong, 1)) {
                obtain2.readLong();
            }
            if (m54805k(readLong, 2)) {
                obtain2.readInt();
            }
            if (m54805k(readLong, 3)) {
                l = Long.valueOf(obtain2.readLong());
            }
            obtain2.recycle();
            return l;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.reflect.Field} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C11065b() {
            /*
                r10 = this;
                java.lang.String r0 = "getSourceNodeId"
                java.lang.String r1 = "AccessibilityBridge"
                r10.<init>()
                r2 = 0
                r3 = 0
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r4 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0012 }
                java.lang.reflect.Method r4 = r4.getMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0012 }
                goto L_0x0018
            L_0x0012:
                java.lang.String r4 = "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection"
                p297mb.C11881b.m57389g(r1, r4)
                r4 = r3
            L_0x0018:
                java.lang.Class<android.view.accessibility.AccessibilityRecord> r5 = android.view.accessibility.AccessibilityRecord.class
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
                java.lang.reflect.Method r0 = r5.getMethod(r0, r6)     // Catch:{ NoSuchMethodException -> 0x0021 }
                goto L_0x0027
            L_0x0021:
                java.lang.String r0 = "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection"
                p297mb.C11881b.m57389g(r1, r0)
                r0 = r3
            L_0x0027:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 26
                r7 = 1
                if (r5 > r6) goto L_0x0058
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r6 = "getParentNodeId"
                java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0039 }
                java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ NoSuchMethodException -> 0x0039 }
                goto L_0x003f
            L_0x0039:
                java.lang.String r5 = "can't invoke getParentNodeId with reflection"
                p297mb.C11881b.m57389g(r1, r5)
                r5 = r3
            L_0x003f:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r6 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r8 = "getChildId"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x004f }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004f }
                r7[r2] = r9     // Catch:{ NoSuchMethodException -> 0x004f }
                java.lang.reflect.Method r1 = r6.getMethod(r8, r7)     // Catch:{ NoSuchMethodException -> 0x004f }
                r2 = r3
                goto L_0x0056
            L_0x004f:
                java.lang.String r2 = "can't invoke getChildId with reflection"
                p297mb.C11881b.m57389g(r1, r2)
                r1 = r3
                r2 = r1
            L_0x0056:
                r3 = r5
                goto L_0x007f
            L_0x0058:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r6 = "mChildNodeIds"
                java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r5.setAccessible(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.String r6 = "android.util.LongArray"
                java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.String r8 = "get"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r7[r2] = r9     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.reflect.Method r1 = r6.getMethod(r8, r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r2 = r1
                r1 = r3
                goto L_0x0080
            L_0x0078:
                java.lang.String r2 = "can't access childNodeIdsField with reflection"
                p297mb.C11881b.m57389g(r1, r2)
                r1 = r3
                r2 = r1
            L_0x007f:
                r5 = r2
            L_0x0080:
                r10.f42652a = r4
                r10.f42653b = r3
                r10.f42654c = r0
                r10.f42655d = r1
                r10.f42656e = r5
                r10.f42657f = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.view.AccessibilityViewEmbedder.C11065b.<init>():void");
        }
    }

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$c */
    private static class C11066c {

        /* renamed from: a */
        final View f42658a;

        /* renamed from: b */
        final int f42659b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11066c)) {
                return false;
            }
            C11066c cVar = (C11066c) obj;
            if (this.f42659b != cVar.f42659b || !this.f42658a.equals(cVar.f42658a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f42658a.hashCode() + 31) * 31) + this.f42659b;
        }

        private C11066c(View view, int i) {
            this.f42658a = view;
            this.f42659b = i;
        }
    }

    AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            Long d = this.reflectionAccessors.m54800f(accessibilityNodeInfo, i2);
            if (d != null) {
                int b = C11065b.m54804j(d.longValue());
                C11066c cVar = new C11066c(view, b);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i3 = this.nextFlutterId;
                    this.nextFlutterId = i3 + 1;
                    cacheVirtualIdMappings(view, b, i3);
                    i = i3;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i2) {
        C11066c cVar = new C11066c(view, i);
        this.originToFlutterId.put(cVar, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (i >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (i >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (i >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (i >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long c = this.reflectionAccessors.m54801g(accessibilityNodeInfo);
        if (c != null) {
            Integer num = this.originToFlutterId.get(new C11066c(view, C11065b.m54804j(c.longValue())));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
            }
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        C11066c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f42658a) || cVar.f42658a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f42658a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f42659b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, cVar.f42658a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long e = this.reflectionAccessors.m54802h(accessibilityRecord);
        if (e == null) {
            return null;
        }
        return this.originToFlutterId.get(new C11066c(view, C11065b.m54804j(e.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long a = this.reflectionAccessors.m54803i(createAccessibilityNodeInfo);
        if (a == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, C11065b.m54804j(a.longValue()), i);
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C11066c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f42658a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
            motionEvent2.getPointerProperties(i2, pointerPropertiesArr[i2]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i2, pointerCoords);
            pointerCoordsArr[i2] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2].x -= (float) rect.left;
            pointerCoordsArr[i2].y -= (float) rect.top;
        }
        return cVar.f42658a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        C11066c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null || (accessibilityNodeProvider = cVar.f42658a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f42659b, i2, bundle);
    }

    public View platformViewOfNode(int i) {
        C11066c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return null;
        }
        return cVar.f42658a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long e = this.reflectionAccessors.m54802h(accessibilityEvent);
        if (e == null) {
            return false;
        }
        int b = C11065b.m54804j(e.longValue());
        Integer num = this.originToFlutterId.get(new C11066c(view, b));
        if (num == null) {
            int i = this.nextFlutterId;
            this.nextFlutterId = i + 1;
            num = Integer.valueOf(i);
            cacheVirtualIdMappings(view, b, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
            AccessibilityRecord record = obtain.getRecord(i2);
            Long e2 = this.reflectionAccessors.m54802h(record);
            if (e2 == null) {
                return false;
            }
            C11066c cVar = new C11066c(view, C11065b.m54804j(e2.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
