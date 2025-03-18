package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.Journal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalApplicationController {

    private final Map<Long, Journal> journals = new HashMap<Long, Journal>();

    @GetMapping
    public List<Journal> getAllJournals(){
      return new ArrayList<Journal>(journals.values());
    };

    @PostMapping
    public void createJournal(@RequestBody Journal journal){
        journals.put(journal.getId(), journal);
    }

    @GetMapping("/{id}")
    public Journal getJournal(@PathVariable Long id){
        return journals.get(id);
    };

    @PutMapping("/{id}")
    public Journal putJournal(@PathVariable Long id, @RequestBody Journal journal){
        return journals.put(id, journal);
    };

    @DeleteMapping("/{id}")
    public Journal deleteJournal(@PathVariable Long id, @RequestBody Journal journal){
        return journals.remove(id);
    };
}
