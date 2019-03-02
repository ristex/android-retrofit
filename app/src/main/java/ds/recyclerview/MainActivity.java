package ds.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView emailRecyclerView;
    private EmailAdapter emailAdapter;
    private List emails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailRecyclerView = findViewById(R.id.email_recycler_view);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        emailRecyclerView.setLayoutManager(layoutManager);

        emails = new ArrayList();
        populateEmails();

        emailAdapter = new EmailAdapter(emails);
        emailRecyclerView.setAdapter(emailAdapter);
    }

    private void populateEmails() {
        for (int i=0; i<10; i++) {
            String sender = "Sender " + String.valueOf(i+1);
            String subject = "Email subject " + String.valueOf(i+1);
            String message = "This is message from email " + String.valueOf(i+1);
            emails.add(new Email(sender, subject, message, R.mipmap.ic_launcher));
        }
    }
}
