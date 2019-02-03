package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.ActionMode
import com.example.momosheduler.Repository.ActionModeRepository
import org.springframework.web.bind.annotation.*


@RestController
class ActionModeControler(var actionModeRepository: ActionModeRepository) {

    @GetMapping("/actionmodes")
    fun all(): ArrayList<ActionMode> = actionModeRepository.findAll() as ArrayList<ActionMode>


    @PostMapping("/actionmodes")
    fun postOneActionMode(@RequestBody actionMode: ActionMode) = actionModeRepository.save(actionMode)


    @DeleteMapping("/actionmodes/{id}")
    fun deleteOneActionMode(@PathVariable id: Long) = actionModeRepository.deleteById(id)


}