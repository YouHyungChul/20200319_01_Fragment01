package kr.co.tjoeun.a20200319_01_fragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.a20200319_01_fragment01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    @Override
    public void setupEvents() {
        binding.firstFragCallBUtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫 프래그먼트 호출 버튼이 눌리면?
//                firstFrag 보이게
//                보이게 하려면 => firstFrag 자체는 기능이 별로 없다.
//                firstFrag를 감싸는 ㅔ이아웃을 추가 => 이아이를 보이게끔
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                secondFrag 숨기게
                binding.secondFragLayout.setVisibility(View.GONE);
            }
        });

        binding.secondFragCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫번째 프래그  : 숨겨줌
                binding.firstFragLayout.setVisibility(View.GONE);
//                두번째 프래그 : 보여줌
                binding.secondFragLayout.setVisibility(View.VISIBLE);

            }
        });

    }

    @Override
    public void setValues() {

    }
}
