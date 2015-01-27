package com.pauselabs.pause;

import com.pauselabs.pause.activity.BlacklistActivity;
import com.pauselabs.pause.activity.BlacklistFragment;
import com.pauselabs.pause.activity.MainActivity;
import com.pauselabs.pause.activity.OnBoardingActivity;
import com.pauselabs.pause.controller.CustomPauseViewController;
import com.pauselabs.pause.controller.EmojiDirectoryViewController;
import com.pauselabs.pause.controller.OnBoardingViewController;
import com.pauselabs.pause.controller.SettingsViewController;
import com.pauselabs.pause.controller.SummaryViewController;
import com.pauselabs.pause.core.PostFromAnyThreadBus;
import com.pauselabs.pause.listeners.PauseSmsListener;
import com.pauselabs.pause.listeners.SilenceListener;
import com.pauselabs.pause.listeners.SpeechListener;
import com.pauselabs.pause.model.JsonReader;
import com.pauselabs.pause.model.PauseConversation;
import com.pauselabs.pause.model.PauseSession;
import com.pauselabs.pause.model.StringRandomizer;
import com.pauselabs.pause.services.PauseApplicationService;
import com.pauselabs.pause.services.PauseSessionService;
import com.pauselabs.pause.view.CustomPauseView;
import com.pauselabs.pause.view.EmojiDirectoryView;
import com.pauselabs.pause.view.NoSessionView;
import com.pauselabs.pause.view.SettingsView;
import com.pauselabs.pause.view.SummaryConversationCard;
import com.pauselabs.pause.view.SummaryReceivedCard;
import com.pauselabs.pause.view.SummarySentCard;
import com.pauselabs.pause.view.SummaryView;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module(
        complete = false,

        injects = {
                PauseApplication.class,

                OnBoardingActivity.class,
                MainActivity.class,
                BlacklistActivity.class,
                BlacklistFragment.class,

                OnBoardingViewController.class,
                NoSessionView.class,

                SummaryViewController.class,
                SummaryView.class,
                SummaryConversationCard.class,
                SummarySentCard.class,
                SummaryReceivedCard.class,

                CustomPauseViewController.class,
                CustomPauseView.class,

                EmojiDirectoryViewController.class,
                EmojiDirectoryView.class,

                SettingsViewController.class,
                SettingsView.class,

                PauseApplicationService.class,
                PauseSessionService.class,
                PauseSession.class,

                SpeechListener.class,
                SilenceListener.class,
                PauseSmsListener.class,

                StringRandomizer.class,
                JsonReader.class,
                PauseConversation.class
        }
)
public class PauseModule {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new PostFromAnyThreadBus();
    }
}