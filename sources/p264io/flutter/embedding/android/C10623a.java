package p264io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import p408yb.C13247a;

/* renamed from: io.flutter.embedding.android.a */
/* compiled from: AndroidTouchProcessor */
public class C10623a {

    /* renamed from: e */
    private static final Matrix f41719e = new Matrix();

    /* renamed from: a */
    private final C13247a f41720a;

    /* renamed from: b */
    private final C10675u f41721b;

    /* renamed from: c */
    private final boolean f41722c;

    /* renamed from: d */
    private final Map<Integer, float[]> f41723d = new HashMap();

    public C10623a(C13247a aVar, boolean z) {
        this.f41720a = aVar;
        this.f41721b = C10675u.m53459a();
        this.f41722c = z;
    }

    /* renamed from: a */
    private void m53236a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        long j;
        double d;
        double d2;
        double d3;
        double d4;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i4 = i;
        int i5 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i5 != -1) {
            long d5 = this.f41722c ? this.f41721b.mo33995c(motionEvent2).mo33996d() : 0;
            int d6 = m53239d(motionEvent.getToolType(i));
            float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
            matrix.mapPoints(fArr);
            if (d6 == 1) {
                j = (long) (motionEvent.getButtonState() & 31);
                if (j == 0 && motionEvent.getSource() == 8194 && i5 == 4) {
                    this.f41723d.put(Integer.valueOf(motionEvent.getPointerId(i)), fArr);
                }
            } else {
                j = d6 == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = this.f41723d.containsKey(Integer.valueOf(motionEvent.getPointerId(i)));
            int i6 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(d5);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                byteBuffer2.putLong((long) m53238c(i5));
                byteBuffer2.putLong(4);
            } else {
                byteBuffer2.putLong((long) i5);
                byteBuffer2.putLong((long) d6);
            }
            byteBuffer2.putLong((long) i6);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i));
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr2 = this.f41723d.get(Integer.valueOf(motionEvent.getPointerId(i)));
                byteBuffer2.putDouble((double) fArr2[0]);
                byteBuffer2.putDouble((double) fArr2[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d2 = 1.0d;
                d = 0.0d;
            } else {
                d = (double) motionRange.getMin();
                d2 = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d);
            byteBuffer2.putDouble(d2);
            if (d6 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i4));
                d3 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            } else {
                d3 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble((double) motionEvent.getSize(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i));
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i4));
            if (d6 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i4));
            } else {
                byteBuffer2.putDouble(d3);
            }
            byteBuffer2.putLong((long) i3);
            if (i6 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(9)));
            } else {
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            if (containsKey) {
                float[] fArr3 = this.f41723d.get(Integer.valueOf(motionEvent.getPointerId(i)));
                byteBuffer2.putDouble((double) (fArr[0] - fArr3[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr3[1]));
                d4 = 0.0d;
            } else {
                d4 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d4);
            if (containsKey && m53238c(i5) == 9) {
                this.f41723d.remove(Integer.valueOf(motionEvent.getPointerId(i)));
            }
        }
    }

    /* renamed from: b */
    private int m53237b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    /* renamed from: c */
    private int m53238c(int i) {
        if (i == 4) {
            return 7;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 6 || i == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    /* renamed from: d */
    private int m53239d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 5 : 3;
        }
        return 1;
    }

    /* renamed from: e */
    public boolean mo33833e(MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int b = m53237b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        m53236a(motionEvent, motionEvent.getActionIndex(), b, 0, f41719e, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
            this.f41720a.mo38350j(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    /* renamed from: f */
    public boolean mo33834f(MotionEvent motionEvent) {
        return mo33835g(motionEvent, f41719e);
    }

    /* renamed from: g */
    public boolean mo33835g(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int b = m53237b(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        if (z) {
            m53236a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect);
        } else if (z2) {
            for (int i = 0; i < pointerCount; i++) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    m53236a(motionEvent, i, 5, 1, matrix, allocateDirect);
                }
            }
            m53236a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect);
        } else {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                m53236a(motionEvent, i2, b, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 280 == 0) {
            this.f41720a.mo38350j(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
