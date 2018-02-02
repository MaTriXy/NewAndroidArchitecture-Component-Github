package florent37.github.com.githubnewandroidarchitecture.repository;

import android.arch.lifecycle.LiveData;

import java.util.List;

import florent37.github.com.githubnewandroidarchitecture.model.Repo;

/**
 * Created by florentchampigny on 18/05/2017.
 */

public interface RepoRepository {
    LiveData<List<Repo>> getRepos(String userName);
}
