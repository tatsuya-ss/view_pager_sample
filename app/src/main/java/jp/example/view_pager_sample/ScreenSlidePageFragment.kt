package jp.example.view_pager_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import jp.example.view_pager_sample.databinding.FragmentScreenSlidePageBinding

class ScreenSlidePageFragment : Fragment() {
    private var _binding: FragmentScreenSlidePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_screen_slide_page, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "    <!-- fragment_screen_slide_page.xml -->\n" +
                "    <ScrollView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        android:id=\"@+id/content\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\" >\n" +
                "\n" +
                "        <TextView style=\"?android:textAppearanceMedium\"\n" +
                "            android:padding=\"16dp\"\n" +
                "            android:lineSpacingMultiplier=\"1.2\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"@string/lorem_ipsum\" />\n" +
                "    </ScrollView>\n"
    }

}