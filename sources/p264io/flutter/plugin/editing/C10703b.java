package p264io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import p264io.flutter.embedding.engine.FlutterJNI;
import p264io.flutter.plugin.editing.C10705c;
import p297mb.C11881b;
import p417zb.C13543p;

/* renamed from: io.flutter.plugin.editing.b */
/* compiled from: InputConnectionAdaptor */
public class C10703b extends BaseInputConnection implements C10705c.C10707b {

    /* renamed from: a */
    private final View f41938a;

    /* renamed from: b */
    private final int f41939b;

    /* renamed from: c */
    private final C13543p f41940c;

    /* renamed from: d */
    private final C10705c f41941d;

    /* renamed from: e */
    private final EditorInfo f41942e;

    /* renamed from: f */
    private ExtractedTextRequest f41943f;

    /* renamed from: g */
    private boolean f41944g;

    /* renamed from: h */
    private CursorAnchorInfo.Builder f41945h;

    /* renamed from: i */
    private ExtractedText f41946i;

    /* renamed from: j */
    private InputMethodManager f41947j;

    /* renamed from: k */
    private final Layout f41948k;

    /* renamed from: l */
    private C10702a f41949l;

    /* renamed from: m */
    private final C10704a f41950m;

    /* renamed from: n */
    private int f41951n;

    /* renamed from: io.flutter.plugin.editing.b$a */
    /* compiled from: InputConnectionAdaptor */
    public interface C10704a {
        /* renamed from: a */
        boolean mo33989a(KeyEvent keyEvent);
    }

    public C10703b(View view, int i, C13543p pVar, C10704a aVar, C10705c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f41944g = false;
        this.f41946i = new ExtractedText();
        this.f41951n = 0;
        this.f41938a = view;
        this.f41939b = i;
        this.f41940c = pVar;
        this.f41941d = cVar;
        cVar.mo34178a(this);
        this.f41942e = editorInfo;
        this.f41950m = aVar;
        this.f41949l = new C10702a(flutterJNI);
        this.f41948k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f41947j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    /* renamed from: b */
    private boolean m53558b(int i) {
        if (i == 16908319) {
            setSelection(0, this.f41941d.length());
            return true;
        } else if (i == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f41941d);
            int selectionEnd = Selection.getSelectionEnd(this.f41941d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f41938a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f41941d.subSequence(min, max)));
                this.f41941d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f41941d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f41941d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f41938a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f41941d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.f41938a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f41938a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f41941d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f41941d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f41941d.delete(min2, max4);
                }
                this.f41941d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    /* renamed from: c */
    private CursorAnchorInfo m53559c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f41945h;
        if (builder == null) {
            this.f41945h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f41945h.setSelectionRange(this.f41941d.mo34186i(), this.f41941d.mo34185h());
        int g = this.f41941d.mo34184g();
        int f = this.f41941d.mo34183f();
        if (g < 0 || f <= g) {
            this.f41945h.setComposingText(-1, "");
        } else {
            this.f41945h.setComposingText(g, this.f41941d.toString().subSequence(g, f));
        }
        return this.f41945h.build();
    }

    /* renamed from: d */
    private ExtractedText m53560d(ExtractedTextRequest extractedTextRequest) {
        CharSequence charSequence;
        ExtractedText extractedText = this.f41946i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f41941d.mo34186i();
        this.f41946i.selectionEnd = this.f41941d.mo34185h();
        ExtractedText extractedText2 = this.f41946i;
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = this.f41941d.toString();
        } else {
            charSequence = this.f41941d;
        }
        extractedText2.text = charSequence;
        return this.f41946i;
    }

    /* renamed from: e */
    private boolean m53561e(boolean z, boolean z2) {
        int i;
        int selectionStart = Selection.getSelectionStart(this.f41941d);
        int selectionEnd = Selection.getSelectionEnd(this.f41941d);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (z) {
            i = Math.max(this.f41949l.mo34149b(this.f41941d, selectionEnd), 0);
        } else {
            i = Math.min(this.f41949l.mo34148a(this.f41941d, selectionEnd), this.f41941d.length());
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        if (z3) {
            setSelection(i, i);
        } else {
            setSelection(selectionStart, i);
        }
        return true;
    }

    /* renamed from: g */
    private boolean m53562g(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.f41941d);
        int selectionEnd = Selection.getSelectionEnd(this.f41941d);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        if (z3) {
            if (z) {
                Selection.moveUp(this.f41941d, this.f41948k);
            } else {
                Selection.moveDown(this.f41941d, this.f41948k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f41941d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
                Selection.extendUp(this.f41941d, this.f41948k);
            } else {
                Selection.extendDown(this.f41941d, this.f41948k);
            }
            setSelection(Selection.getSelectionStart(this.f41941d), Selection.getSelectionEnd(this.f41941d));
        }
        endBatchEdit();
        return true;
    }

    /* renamed from: h */
    private byte[] m53563h(InputStream inputStream, int i) {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            try {
                i2 = inputStream.read(bArr);
            } catch (IOException unused) {
                i2 = -1;
            }
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    /* renamed from: a */
    public void mo34157a(boolean z, boolean z2, boolean z3) {
        this.f41947j.updateSelection(this.f41938a, this.f41941d.mo34186i(), this.f41941d.mo34185h(), this.f41941d.mo34184g(), this.f41941d.mo34183f());
        if (Build.VERSION.SDK_INT >= 21) {
            ExtractedTextRequest extractedTextRequest = this.f41943f;
            if (extractedTextRequest != null) {
                this.f41947j.updateExtractedText(this.f41938a, extractedTextRequest.token, m53560d(extractedTextRequest));
            }
            if (this.f41944g) {
                this.f41947j.updateCursorAnchorInfo(this.f41938a, m53559c());
            }
        }
    }

    public boolean beginBatchEdit() {
        this.f41941d.mo34179b();
        this.f41951n++;
        return super.beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int i) {
        return super.clearMetaKeyStates(i);
    }

    public void closeConnection() {
        super.closeConnection();
        this.f41941d.mo34187l(this);
        while (this.f41951n > 0) {
            endBatchEdit();
            this.f41951n--;
        }
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f41938a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h = m53563h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put(JsonStorageKeyNames.DATA_KEY, h);
                                hashMap.put("uri", contentUri.toString());
                                this.f41940c.mo38656b(this.f41939b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (this.f41941d.mo34186i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f41951n--;
        this.f41941d.mo34181d();
        return endBatchEdit;
    }

    /* renamed from: f */
    public boolean mo34166f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return m53561e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return m53561e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return m53562g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return m53562g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f41942e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f41941d);
            int selectionEnd = Selection.getSelectionEnd(this.f41941d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart < 0 || selectionEnd < 0 || unicodeChar == 0) {
                return false;
            }
            int min = Math.min(selectionStart, selectionEnd);
            int max = Math.max(selectionStart, selectionEnd);
            beginBatchEdit();
            if (min != max) {
                this.f41941d.delete(min, max);
            }
            this.f41941d.insert(min, String.valueOf((char) unicodeChar));
            int i = min + 1;
            setSelection(i, i);
            endBatchEdit();
            return true;
        } else if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
            return false;
        } else {
            int selectionEnd2 = Selection.getSelectionEnd(this.f41941d);
            setSelection(selectionEnd2, selectionEnd2);
            return true;
        }
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public Editable getEditable() {
        return this.f41941d;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        boolean z2 = (i & 1) != 0;
        if (this.f41943f != null) {
            z = false;
        }
        if (z2 == z) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z2 ? "on" : "off");
            C11881b.m57383a("InputConnectionAdaptor", sb.toString());
        }
        this.f41943f = z2 ? extractedTextRequest : null;
        return m53560d(extractedTextRequest);
    }

    public boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean b = m53558b(i);
        endBatchEdit();
        return b;
    }

    public boolean performEditorAction(int i) {
        if (i == 0) {
            this.f41940c.mo38667o(this.f41939b);
        } else if (i == 1) {
            this.f41940c.mo38659g(this.f41939b);
        } else if (i == 2) {
            this.f41940c.mo38658f(this.f41939b);
        } else if (i == 3) {
            this.f41940c.mo38664l(this.f41939b);
        } else if (i == 4) {
            this.f41940c.mo38665m(this.f41939b);
        } else if (i == 5) {
            this.f41940c.mo38660h(this.f41939b);
        } else if (i != 7) {
            this.f41940c.mo38657e(this.f41939b);
        } else {
            this.f41940c.mo38662j(this.f41939b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f41940c.mo38661i(this.f41939b, str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((i & 1) != 0) {
            this.f41947j.updateCursorAnchorInfo(this.f41938a, m53559c());
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if (z != this.f41944g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z ? "on" : "off");
            C11881b.m57383a("InputConnectionAdaptor", sb.toString());
        }
        this.f41944g = z;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f41950m.mo33989a(keyEvent);
    }

    public boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z;
        beginBatchEdit();
        if (charSequence.length() == 0) {
            z = super.commitText(charSequence, i);
        } else {
            z = super.setComposingText(charSequence, i);
        }
        endBatchEdit();
        return z;
    }

    public boolean setSelection(int i, int i2) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i2);
        endBatchEdit();
        return selection;
    }

    public C10703b(View view, int i, C13543p pVar, C10704a aVar, C10705c cVar, EditorInfo editorInfo) {
        this(view, i, pVar, aVar, cVar, editorInfo, new FlutterJNI());
    }
}
