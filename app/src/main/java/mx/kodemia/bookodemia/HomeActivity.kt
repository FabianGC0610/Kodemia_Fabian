package mx.kodemia.bookodemia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listFragment = ListFragment()
        val homeFragment = HomeFragment()
        val userFragment = UserFragment()

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_list -> {
                    setCurrentFragment(listFragment)
                    true
                }
                R.id.nav_home -> {
                    setCurrentFragment(homeFragment)
                    true
                }
                R.id.nav_user -> {
                    setCurrentFragment(userFragment)
                    true
                }
                else -> false
            }
        }

    }

    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.ContainerView,fragment)
            commit()
        }
    }

}