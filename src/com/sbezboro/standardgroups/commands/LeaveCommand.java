package com.sbezboro.standardgroups.commands;

import org.bukkit.command.CommandSender;

import com.sbezboro.standardgroups.StandardGroups;
import com.sbezboro.standardgroups.managers.GroupManager;
import com.sbezboro.standardplugin.StandardPlugin;
import com.sbezboro.standardplugin.commands.BaseCommand;
import com.sbezboro.standardplugin.commands.SubCommand;
import com.sbezboro.standardplugin.model.StandardPlayer;

public class LeaveCommand extends SubCommand {

	public LeaveCommand(StandardPlugin plugin, BaseCommand command) {
		super(plugin, command, "leave");
	}

	@Override
	public boolean handle(CommandSender sender, String[] args) {
		StandardPlayer player = plugin.getStandardPlayer(sender);
		
		GroupManager groupManager = StandardGroups.getPlugin().getGroupManager();
		groupManager.leaveGroup(player);
		
		return true;
	}

	@Override
	public void showHelp(CommandSender sender) {
		sender.sendMessage("/g leave - leave a group you are in");
	}
	
}